package 이차원배열;

public class ex02이차원배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];
		int num=21;
		for(int i=0; i<5; i++ ) {
			for (int j=0; j<5; j++ ) {
				arr[j][i] = num+j *5 +i;
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
