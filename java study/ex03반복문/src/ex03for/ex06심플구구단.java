package ex03for;

public class ex06심플구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 2; j <=9 ; j++) {
			System.out.print(j+ "단:\t");
			for (int i = 1; i <=9 ; i++) {
				System.out.print(j+"*"+ i + "=" +  j*i+ " ");
			}
			System.out.println();
		}
		
	}

}
