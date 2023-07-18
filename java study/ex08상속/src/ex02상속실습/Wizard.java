package ex02상속실습;

public class Wizard extends Beginner {
	int level;
	String nickName;
	int hp;
	int exp;
	int mp;
	
	public void snailThrow() {
		System.out.println("달팽이 던지기 이야아압!");
	}
	public void recovery() {
		System.out.println("회복...");
	}
	public void agileMovement() {
		System.out.println("민첩한 몸놀림!");
	}
	public void energyBolt() {
		System.out.println("에너지볼트!");
	}
}
