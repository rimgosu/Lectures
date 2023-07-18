package 저금통;

public class PiggyBank {
	/*
	 * private (사적인)
	 * : 클래스 내부에 있는 매서드를 통해서만 접근 가능하도록
	 *   도와주는 접근제한자
	 * - private으로 감싸진 필드에 접근하고 싶으면
	 *   클래스 내부에 메서드가 설계되어있어야 한다.
	 * 수정(set), 가져와서 확인(get)
	 */
	private int money;
	
	/*
	 * getter/setter
	 * : private로 감싸진 필드에 접근할 수 있도록
	 *   클래스 내부에 만들어진 메서드
	 *   money를 수정할 수 있는 메서드
	 */
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	
	public void deposit(int money) {
		this.money += money;
		System.out.println(money);
		System.out.println("돈을 넣음");
	}
	public void withdraw(int money) {
		this.money -= money;
		System.out.println(money);
		System.out.println("돈을 인출함");
	}
	public void showMoney() {
		System.out.println(money);
		System.out.println("잔액 보여줌");
	}
	
	public PiggyBank() {}
	public PiggyBank(int money) {
		this.money = money;
	}
}
