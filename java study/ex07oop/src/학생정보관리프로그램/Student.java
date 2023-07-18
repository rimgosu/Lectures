package 학생정보관리프로그램;

public class Student {
	/*
	 * 학생정보관리 프로그램에 대한 설계도
	 */
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scorePython;
	
	public void show() {
		System.out.println(name+"님 "+ "안녕하세요.");
		System.out.println("[ "+number+", "+age+"살 ]");
		System.out.println(name+"님의 Java 점수는 "+scoreJava+"점 입니다." );
		System.out.println(name+"님의 Web 점수는 "+scoreWeb+"점 입니다." );
		System.out.println(name+"님의 Python 점수는 "+scorePython+"점 입니다." );
		System.out.println("=============================================");
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public int getScorePython() {
		return scorePython;
	}
	public void setScorePython(int scorePython) {
		this.scorePython = scorePython;
	}
	/*
	 * 단축키: alt + shift + s
	 */
	
	
	public Student(
			String name,
			String number,
			int age,
			int scoreJava,
			int scoreWeb,
			int scorePython
			) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scorePython = scorePython;
	}
	

	public Student() {
		
	}
}
