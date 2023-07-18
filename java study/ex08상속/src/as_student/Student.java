package as_student;

public class Student {
	private String name;
	private String number;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	public Student(String name, String number, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	public Student() {};

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}
	
	
}
