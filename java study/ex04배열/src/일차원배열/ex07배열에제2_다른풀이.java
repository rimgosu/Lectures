package 일차원배열;

import java.util.Random;

public class ex07배열에제2_다른풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int[] lotto = new int[6];
		
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = rd.nextInt(45)+1;
			for (int j=0; j<i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
