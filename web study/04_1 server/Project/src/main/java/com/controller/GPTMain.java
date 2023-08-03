package com.controller;

import java.io.IOException;

import com.model.Gpt3DAO;

public class GPTMain {
    private static final String API_KEY = "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";

    public static void main(String[] args) throws IOException {
    	String prompt = "HTTP/1.1 200 OK\r\n"
    			+ "[영수증] 스위트인디아 / 401-11-84868 전라북도 군산시 거석길 36 KENYA ESPRESSO 36 063-445-8522 / 20160530-01-0003 2016-05-30 13:11: 26 합계 금액 36,000 32,730 부 부가세 과세물품가액 가 세 3,270 신용승인정보(고객용) [1] 카드종류: 씨티카드 카드번호: -0144 할부개월: 일시불 판매금액: 32,730 부 가 세: 3.270 승인금액: 36,000 승인번호: 승인일시: 2016-05-30 13: 11: 29 가맹점 번호: 789811155 \r\n"
    			+ "주소와 상호명과 총가격 정리해줘";
        Gpt3DAO dao = new Gpt3DAO(API_KEY, prompt);
        System.out.println(dao.getAiResponse());
        
    }
}