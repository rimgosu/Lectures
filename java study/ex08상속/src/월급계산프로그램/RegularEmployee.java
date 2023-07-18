package 월급계산프로그램;

public class RegularEmployee extends __protected__abstract__Employee {
    int bonus;

    public RegularEmployee(String empNo, String name, int pay, int bonus) {
        super(empNo, name, pay);
        this.bonus = bonus;
    }

    public int getMoneyPay() {
        return (pay + bonus) / 12;
    }
    
    
    
}