

import okhttp3.*;

import java.io.IOException;

public class GPT3Example {

    private static final String API_KEY = "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";

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"model\":\"gpt-3.5-turbo\",\"messages\":[{\"role\":\"user\",\"content\":\"Translate the following English text to Korean: 'Hello, how are you?'\"}]}");
        Request request = new Request.Builder()
                .url("https://api.openai.com/v1/chat/completions")
                .post(body)
                .addHeader("content-type", "application/json")
                .addHeader("authorization", "Bearer " + API_KEY)
                .build();

        Response response = client.newCall(request).execute();
        String result = response.body().string();
        System.out.println(result);
    }
}

