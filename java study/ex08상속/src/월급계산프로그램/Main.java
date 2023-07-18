package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		RegularEmployee r = new RegularEmployee("SMHRD001", "홍길동", 4000, 400);
		System.out.println(r.print());
		System.out.println(r.getMoneyPay());
		
		TempEmployee t = new TempEmployee("SMHRD002", "박문수", 3000);
		System.out.println(t.print());
		System.out.println(t.getMoneyPay());
		
		PartTimeEmployee p = new PartTimeEmployee("SMHRD003", "임성훈", 10, 10);
		System.out.println(p.print());
		System.out.println(p.getMoneyPay());
		
		/**
		 * 추상 클래스의 객체 생성이 X!
		 * __protected__abstract__Employee emp = new __protected__abstract__Employee("SMHRD003", "조자연", 500);
		 */
		
	}

}
