package 일차원배열;

public class ex03배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) 정수형 데이터를 저장할 수 있는 arr 배열 생성
		// 2) 문제에 적혀있는 값으로 초기화
		// 	  23,45,95,17,6,89,47,56,68,17
		// 3) arr에 들어있는 값들 중에서 가장 큰 값을 찾아서 출력해보자
		// 4) arr에 들어있는 값들 중에서 가장 작은 값을 찾아서 출력해보자
		int[] arr = {23,45,95,17,6,89,47,56,68,17};
		int max = arr[0];
		int min = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max :" + max);
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min :" + min);
	}

}
