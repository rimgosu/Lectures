package ex01while;

public class ex01while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		while (num <= 5) {
			System.out.println(num);
			num++ ;
			break;
		}
		
		while (true) {
			System.out.println(num);
			num++ ; 
			switch(num) {
			case 10:
				break;

			}
		}
		// System.out.println(num);
	}

}
