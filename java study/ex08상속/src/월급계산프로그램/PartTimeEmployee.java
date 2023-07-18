package 월급계산프로그램;

public class PartTimeEmployee extends __protected__abstract__Employee {
	int workDay;

	public PartTimeEmployee(String empNo, String name, int pay, int workDay) {
		super(empNo, name, pay);
		this.workDay = workDay;
		// TODO Auto-generated constructor stub
	}
	public int getMoneyPay() {
        return pay*workDay;
    }
	
}
