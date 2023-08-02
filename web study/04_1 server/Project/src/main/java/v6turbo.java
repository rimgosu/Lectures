

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class v6turbo {
    private static final String API_KEY = "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";

    public static void main(String[] args) throws IOException {
        String prompt = "Who won the world series in 2020?";

        OkHttpClient client = new OkHttpClient();

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

        Gson gson = new Gson();
        String jsonBody = gson.toJson(body);

        RequestBody requestBody = RequestBody.create(
                jsonBody,
                MediaType.parse("application/json; charset=utf-8")
        );

        Request request = new Request.Builder()
                .url("https://api.openai.com/v1/chat/completions")
                .addHeader("Authorization", "Bearer " + API_KEY)
                .post(requestBody)
                .build();

        Response response = client.newCall(request).execute();
        String responseJson = response.body().string();

        JsonObject convertedObject = new Gson().fromJson(responseJson, JsonObject.class);
        String assistantReply = convertedObject.getAsJsonArray("choices").get(0).getAsJsonObject().get("message").getAsJsonObject().get("content").getAsString();

        System.out.println(assistantReply);
    }
}
