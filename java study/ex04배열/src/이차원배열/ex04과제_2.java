package 이차원배열;

public class ex04과제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];
		for (int i=0; i<arr.length ; i++) {
			for (int j=0; j<arr.length ; j++) {
				arr[i][j] = 25- i+j *5;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
