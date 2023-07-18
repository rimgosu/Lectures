package 일차원배열;

import java.util.Scanner;

public class ex09배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = new int[5];
		int[] _answer = {1,4,3,2,1};
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		for (int i=0; i < answer.length; i++) {
			System.out.print((i+1) + "번답");
			answer[i] = sc.nextInt();
 		}
		System.out.println("정답확인");
		for (int i=0; i< answer.length; i++) {
			if(answer[i] == _answer[i]) {
				System.out.print("O ");
				score += 20;
			} else {
				System.out.print("X ");
			}
		}
		System.out.print("총점 : " + score);
		sc.close();
	}

}
