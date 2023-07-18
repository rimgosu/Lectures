package ex01while;

import java.util.Scanner;

public class ex03다이어트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게: ");
		int current = sc.nextInt();
		System.out.print("목표몸무게: ");
		int target = sc.nextInt();
		
		int i = 1;
		
		while (current > target) {
			System.out.print(i + "주차 감량 몸무게: ");
			int out = sc.nextInt();
			current = current - out;
			i++;
		} 
		
		System.out.print(current);
		System.out.println("kg 달성!! 축하합니다!");
		sc.close();
	}

}
