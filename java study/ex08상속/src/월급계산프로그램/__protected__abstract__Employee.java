package 월급계산프로그램;

/**
 * Abstract class:
 * 1) 추상 메서드를 포함하고 있는 클래스는 반드시 추상 클래스가 되어야 한다!
 * 2) 추상 클래스도 일반 메서드 포함할 수 있다!
 * 3) 추상 클래스지만 추성 메서드 없어도 된다!
 * 4) 추상 클래스는 객체 생성(실체화)가 불가능하다!
 * + 방법 : public abstract class Employee
 */
public abstract class __protected__abstract__Employee {
	/**
	 * protected:
	 * 상속 관계에 있는 클래스들 끼리 + 같은 패키지에 있는 클래스들 끼리는
	 * 접근이 가능하도록 도와주는 접근제한자이다.
	 */
	protected String EmpNo;
	protected String Name;
	protected String Employee;
	protected int pay;
	protected int bigo;
	public __protected__abstract__Employee(String empNo, String name, int pay) {
		this.EmpNo = empNo;
		this.Name = name;
		this.pay = pay;
	}
	public String print() {
    	String x = "";
    	x += Integer.toString(pay);
        return ""+ EmpNo + ":" + Name + ":" + x;
    }
	
	/**
	 * abstract:
	 * 부모 클래스에 있는 getMoneyPay는 자식클래스에서 매번 구현단이 바뀌는중
	 * public int getMoneyPay() {return pay;}
	 * abstract 키워드를 통해서 일반메서드를 추상메서드로 만들 수 있다.
	 * 추상메서드 : 선언만 되어있고, 바디가 없는({}중괄호) 메서드이다!
	 */
	public abstract int getMoneyPay();
	
	
	
}
