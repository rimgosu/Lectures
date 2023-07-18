package 월급계산프로그램;

public class TempEmployee extends __protected__abstract__Employee{

	public TempEmployee(String empNo, String name, int pay) {
		super(empNo, name, pay);
	}

	@Override
	public int getMoneyPay() {
		return pay/12;
	}
	
}
