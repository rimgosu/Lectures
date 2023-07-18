package ex02연산자;

import java.util.Scanner;

public class ex02산술연산자실습 {
	public static void main(String[] args) {
		//3723초 -> 1시간2분3초
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력: ");
		int totalSecond = sc.nextInt();
		
		int temp = totalSecond / 60;
		int second = totalSecond % 60;
		int hour = temp / 60;
		int min = temp %60;
		
		System.out.println(hour+"시간 "+min+"분 "+second+"초");
		
	}

}
