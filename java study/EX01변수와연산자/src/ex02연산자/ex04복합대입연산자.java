package ex02연산자;

public class ex04복합대입연산자 {
	public static void main(String[] args) {
		int a = 10;
		// 기존 a값에 10을 더 더해주고싶으면?
		a = a+10;   //20
		a += 10;    //30
		a -= 5;     //25
		a /= 2;     //12
		a *= 152;   //1824
		a %= 100;   //24
		System.out.println(a);
		
		int num = 29;
		num -= 2+3*4; // num= num-14
		System.out.println(num);
	}
}
