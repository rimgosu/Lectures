package com.model;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class OcrDAO2 {

    private String invokeUrl;
    private String secretKey;
    private String format;
    private String imagePath;

    public OcrDAO2(String invokeUrl, String secretKey, String format, String imagePath) {
        this.invokeUrl = invokeUrl;
        this.secretKey = secretKey;
        this.format = format;
        this.imagePath = imagePath;
    }

    private String parseJson(String jsonString) {
        JSONObject obj = new JSONObject(jsonString);
        JSONArray images = obj.getJSONArray("images");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < images.length(); i++) {
            JSONObject image = images.getJSONObject(i);
            JSONArray fields = image.getJSONArray("fields");

            for (int j = 0; j < fields.length(); j++) {
                JSONObject field = fields.getJSONObject(j);

                if (field.getDouble("inferConfidence") >= 0.9) {
                    result.append(field.getString("inferText"));
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }

    private String encodeFileToBase64Binary(String imagePath) throws Exception {
        byte[] fileContent = Files.readAllBytes(Paths.get(imagePath));
        return Base64.getEncoder().encodeToString(fileContent);
    }

    public String callOcrApi() throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost(invokeUrl);
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setHeader("X-OCR-SECRET", secretKey);

        String imageData = encodeFileToBase64Binary(imagePath);

        String body = "{\n" +
                "    \"images\": [\n" +
                "      {\n" +
                "        \"format\": \"" + format + "\",\n" +
                "        \"name\": \"medium\",\n" +
                "        \"data\": \"" + imageData + "\",\n" +
                "        \"url\": null\n" +
                "      }\n" +
                "    ],\n" +
                "    \"lang\": \"ko\",\n" +
                "    \"requestId\": \"string\",\n" +
                "    \"resultType\": \"string\",\n" +
                "    \"timestamp\": "+ System.currentTimeMillis() +",\n" +
                "    \"version\": \"V1\"\n" +
                "}";
        httpPost.setEntity(new StringEntity(body));

        CloseableHttpResponse response = httpclient.execute(httpPost);

        String converted = "";

        try {
            System.out.println(response.getStatusLine());
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                converted += parseJson(result);
            }
        } finally {
            response.close();
        }

        return converted;
    }
}
