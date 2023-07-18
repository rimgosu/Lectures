package 일차원배열;

public class ex02배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 배열 arr 생성
		// 3, 10, 4, 8, 17, 22, 31
		// for문 사용해서 출력
		int[] arr = {3,10,4,8,17,22,31};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%2 ==0) {
				System.out.println(arr[i]);
			}
		}
		
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
