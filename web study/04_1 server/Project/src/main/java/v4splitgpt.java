

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class v4splitgpt {
    public static void chatGPT(String text) throws Exception {
        String url = "https://api.openai.com/v1/completions";
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();

        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Authorization", "Bearer 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");

        List<String> splitPrompt = splitPromptIntoParts(text, 20);

        String previousResponse = "";

        for (String part : splitPrompt) {
            JSONObject data = new JSONObject();
            data.put("model", "text-davinci-003");
            data.put("prompt", previousResponse + part);
            data.put("max_tokens", 4000);
            data.put("temperature", 1.0);

            con.setDoOutput(true);
            con.getOutputStream().write(data.toString().getBytes());

            String output = new BufferedReader(new InputStreamReader(con.getInputStream())).lines()
                .reduce((a, b) -> a + b).get();

            previousResponse = new JSONObject(output).getJSONArray("choices").getJSONObject(0).getString("text");

            System.out.println(previousResponse);
        }
    }

    private static List<String> splitPromptIntoParts(String text, int partSize) {
        List<String> parts = new ArrayList<>();
        int len = text.length();
        for (int i=0; i<len; i+=partSize)
        {
            parts.add(text.substring(i, Math.min(len, i + partSize)));
        }
        return parts;
    }

    public static void main(String[] args) throws Exception {
        String prompt = "세계 1등 편의점 (주)코리아세븐 www7 eleven kr 세븐일레븐 문정수정점#18308 (02-400-6307) 2158544631 송파구 동남로 8길 12 (문정동) 현금(자진발급) 그 객 용 [판 매] 2020-06-09 (화) 20: 59: 47 상품명 수량 금 액 라라스윗)바닐라피인트474 행사 8809599360081 1 6,900 라라스윗)초코피인트474ml 행사 8809599360104 1 6,900 비닐봉투 보증금 20원 *1171798100209 1 20 과세물품가액 12,545 부 가 세 1,255 봉투보증금액 20 합계 ₩13,820 20//여기서 주소는?"; 
        chatGPT(prompt);
    }
}
