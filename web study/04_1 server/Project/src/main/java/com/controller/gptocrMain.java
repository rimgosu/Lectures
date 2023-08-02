package com.controller;

import com.model.Gpt3DAO;
import com.model.KeyDAO;
import com.model.OcrDAO;

public class gptocrMain {
	
	public static void main(String[] args) {
		KeyDAO keyDAO = new KeyDAO("./src/resources/keys.json");
		// TODO Auto-generated method stub
		String API_KEY = keyDAO.getKeyValue("gptPrivateKey");
		String invokeUrl = keyDAO.getKeyValue("clovaOCRInvokeURL"); 
        String secretKey = keyDAO.getKeyValue("clovaOCRPrivateKey");
        
        String format = "png";
        String url = "https://image.kmib.co.kr/online_image/2018/0114/611211110012048428_1.jpg";
		OcrDAO ocrdao = new OcrDAO(invokeUrl, secretKey, format, url);
		
		String prompt;
		try {
			prompt = ocrdao.callOcrApi();
			prompt += " '주소'컬럼, '총금액'컬럼, '상호명'컬럼에 각각 값을 넣어줘";
	        Gpt3DAO gptdao = new Gpt3DAO(API_KEY, prompt);
	        System.out.println(gptdao.getAiResponse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
