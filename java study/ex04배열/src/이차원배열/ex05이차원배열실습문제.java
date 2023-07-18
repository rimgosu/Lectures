package 이차원배열;

public class ex05이차원배열실습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];
		int num = 21;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i%2 == 0) {
					arr[i][j] = num + j ;
				} else {
					arr[i][j] = num -j ;
				}
				
				System.out.print(arr[i][j] + "\t");
			}
			if (i%2 == 0) {
				num += 9;
			} else {
				num += 1;
			}
			System.out.println();
		}
	}

}
