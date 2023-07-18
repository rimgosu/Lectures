package 일차원배열;

import java.util.Random;

public class ex07배열예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		Random random = new Random();
		int index=0;
		boolean breaker = false;
		while(index < arr.length) {
			int randNum = random.nextInt(45)+1;
			for (int j=0; j < arr.length; j++) {
				if (arr[j] == randNum) {
					breaker = true;
					break;
				}
			}
			if (breaker) {
				breaker = false;
				continue;
			}
			arr[index] = randNum;
			index++;
		}
			
		
		
		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호는요...!두구두구두구!!!!");
		for (int i=0; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
