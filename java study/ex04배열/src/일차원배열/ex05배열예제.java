package 일차원배열;

import java.util.Scanner;

public class ex05배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) 입력하는 도구 가져오기
		// 2) 사용자가 입력한 5개의 점수들을 배열에 저장
		// 배열의 이름 : score
		// 3) 입력된 점수들을 모두 출력하기
		// 4) 최고 점수, 최저점수
		// 5) 총합, 평균
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		
		for (int i = 0 ; i < score.length ; i++) {
			int inputNum = sc.nextInt();
			score[i] = inputNum;
		}
		int max = score[0];
		int min = score[0];
		int sum = 0;
		double avg;
		for (int i = 0 ; i < score.length ; i++) {
			System.out.print(score[i] + " ");
		}
		for (int i=0; i<score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println();
		System.out.println("min, max:" + min + "," + max);
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		avg = (double)sum / score.length;
		System.out.println("sum, avg:" + sum + "," + avg);
	}

}
