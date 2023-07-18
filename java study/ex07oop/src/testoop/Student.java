package testoop;

public class Student {
	// 여기 아래에 Student 클래스를 설계하시오
    
    // 메소드 이름을 정확히 지켜주세요
    // getter -> getName(), getNumber(), getScoreJava(), getScoreWeb(), getScoreAndroid()
    // setter -> setName(), setNumber(), setScoreJava(), setScoreWeb(), setScoreAndroid()
    private String name;
    private String number;
    private int scoreJava;
    private int scoreWeb;
    private int scoreAndroid;
    
	public Student(String name, String number, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
    
    
    
    
    
    
}

