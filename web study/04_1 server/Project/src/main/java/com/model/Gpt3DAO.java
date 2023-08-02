package com.model;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gpt3DAO {
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private OkHttpClient client;
    private Gson gson;
    private String apiKey;
    private String prompt;

    public Gpt3DAO() {
        this.client = new OkHttpClient();
        this.gson = new Gson();
    }
    
    public Gpt3DAO(String apiKey, String prompt) {
        this.client = new OkHttpClient();
        this.gson = new Gson();
        this.apiKey = apiKey;
        this.prompt = prompt;
    }

    public String getAiResponse() throws IOException {
        Map<String, String> systemMessage = new HashMap<>();
        systemMessage.put("role", "system");
        systemMessage.put("content", "You are a helpful assistant.");

        Map<String, String> userMessage = new HashMap<>();
        userMessage.put("role", "user");
        userMessage.put("content", prompt);

        List<Map<String, String>> messages = new ArrayList<>();
        messages.add(systemMessage);
        messages.add(userMessage);

        Map<String, Object> body = new HashMap<>();
        body.put("model", "gpt-3.5-turbo");
        body.put("messages", messages);

        String jsonBody = gson.toJson(body);

        RequestBody requestBody = RequestBody.create(
                jsonBody,
                JSON
        );

        Request request = new Request.Builder()
                .url("https://api.openai.com/v1/chat/completions")
                .addHeader("Authorization", "Bearer " + apiKey)
                .post(requestBody)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String responseJson = response.body().string();

            JsonObject convertedObject = new Gson().fromJson(responseJson, JsonObject.class);
            return convertedObject.getAsJsonArray("choices").get(0).getAsJsonObject().get("message").getAsJsonObject().get("content").getAsString();
        }
    }
}
