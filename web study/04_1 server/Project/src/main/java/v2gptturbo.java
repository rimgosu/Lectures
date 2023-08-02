

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class v2gptturbo {
    public static void chatGPT(String text) throws Exception {
        String url = "	https://api.openai.com/v1/chat/completions";
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();

        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Authorization", "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");

        JSONObject data = new JSONObject();
        data.put("model", "gpt-3.5-turbo");
        data.put("prompt", text);
        data.put("max_tokens", 4000);
        data.put("temperature", 1.0);

        con.setDoOutput(true);
        con.getOutputStream().write(data.toString().getBytes());

        String output = new BufferedReader(new InputStreamReader(con.getInputStream())).lines()
                .reduce((a, b) -> a + b).get();

        System.out.println(new JSONObject(output).getJSONArray("choices").getJSONObject(0).getString("text"));
    }

    public static void main(String[] args) throws Exception {
    	String prompt = "세계 1등 편의점 (주)코리아세븐 www7 eleven kr 세븐일레븐 문정수정점#18308 (02-400-6307) 2158544631 송파구 동남로 8길 12 (문정동) 현금(자진발급) 그 객 용 [판 매] 2020-06-09 (화) 20: 59: 47 상품명 수량 금 액 라라스윗)바닐라피인트474 행사 8809599360081 1 6,900 라라스윗)초코피인트474ml 행사 8809599360104 1 6,900 비닐봉투 보증금 20원 *1171798100209 1 20 과세물품가액 12,545 부 가 세 1,255 봉투보증금액 20 합계 ₩13,820 20//여기서 주소는?"; 
        chatGPT(prompt);
    }
}