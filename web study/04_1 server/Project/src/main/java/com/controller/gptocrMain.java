package com.controller;

import com.model.Gpt3DAO;
import com.model.KeyDAO;
import com.model.OcrDAO;
import com.model.OcrDAO2;

public class gptocrMain {
	
	public static void main(String[] args) {
		KeyDAO keyDAO = new KeyDAO("C://keys.json");
		// TODO Auto-generated method stub
		String API_KEY = keyDAO.getKeyValue("gptPrivateKey");
		String invokeUrl = keyDAO.getKeyValue("clovaOCRInvokeURL"); 
        String secretKey = keyDAO.getKeyValue("clovaOCRPrivateKey");
        
        
        String format = "png";
//        String url = "https://www.safetimes.co.kr/news/photo/201908/76799_52073_811.png";
        String url = "C:/test2.jpg";
		OcrDAO2 ocrdao = new OcrDAO2(invokeUrl, secretKey, format, url);
		
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
