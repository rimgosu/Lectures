package ex03for;

public class ex04_369게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int div10;
		for (int i = 1; i <= 50; i++) {
			div10 = i % 10 ;
			switch (div10) {
			case 3,6,9 :
				System.out.print("박수 ");
				break;
			case 5 :
				System.out.print("으악 ");
				break;
			default :
				System.out.print(i + " ");
			}
		}
	}

}
