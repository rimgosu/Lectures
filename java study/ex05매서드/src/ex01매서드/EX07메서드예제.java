package ex01매서드;

public class EX07메서드예제 {
	public static boolean isDivisor(int a,int b) {
		if (a%b== 0) {
			return true;
		} return false;
	}
	public static void getDivisor(int a) {
		System.out.print(a+"의 약수 : ");
		for (int i=1; i<=a; i++) {
			if (isDivisor(a,i)) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
	}
	public static int getSumOfDivisors(int num) {
		int sum=0;
		for (int i=1; i<num; i++) {
			if (isDivisor(num,i)) {
				sum+= i;
			}
		}
		return sum;
	}
	public static void getPerfectNumber(int start, int end) {
		System.out.print(start + "~" + end + "까지의 완전수 : ");
		for (int j=start; j<=end; j++) {
//			System.out.println(j);
//			System.out.println(getSumOfDivisors(j));
			if (j == getSumOfDivisors(j)) {
				System.out.print(j + " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나를 제외한 약수의 합이 나와 같은 수
		int s = 2;
		int e = 2000000000;
		getPerfectNumber(s,e);
	}

}
