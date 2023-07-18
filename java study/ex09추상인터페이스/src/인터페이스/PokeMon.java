package 인터페이스;

public interface PokeMon {
	/**
	 * 모든 캐릭터가 가져야할 기능:
	 * 1. 공격 2. 특수공격
	 * 
	 * 인터페이스:
	 * 프로젝트 지침서, 설계도
	 * 
	 * 1) 필드:
	 * 상수만 가능
	 * 2) 메서드:
	 * 
	 * 단, 메서드는 반드시 선언만 되어있어야한다.
	 * 인터페이스는 일반 메서드를 포함할 수 없다. (추상 클래스랑 다름)
	 */
	final String name = "조자연";
	
	/**
	 * 일반공격: atk
	 * 특수공격: specialAtk
	 */
	public abstract void atk();
	public abstract void specialAtk();
}

