package as_student;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller extends Student{
	
	
	public Controller(String name, String number, int scoreJava, int scoreWeb, int scoreAndroid) {
		super(name, number, scoreJava, scoreWeb, scoreAndroid);
	}
	public Controller() {};
	
	public void __1__(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String input_1 = sc.next();
		System.out.print("학번 : ");
		String input_2 = sc.next();
		System.out.print("Java점수 : ");
		int input_3 = sc.nextInt();
		System.out.print("Web점수 : ");
		int input_4 = sc.nextInt();
		System.out.print("Android점수 : ");
		int input_5 = sc.nextInt();
		
		Student s = new Student(input_1, input_2, input_3, input_4, input_5);
		arr.add(s);
	}
	public void __2__(ArrayList<Student> arr) {
		System.out.println("==================전체조회========================");
		if (arr.size() == 0) {
			System.out.println("조회 할 데이터가 없습니다.");
		} else {
			System.out.println("이름\t학번\tJava\tAndroid\tWeb");
			for (int i=0; i<arr.size(); i++) {
				System.out.print(arr.get(i).getName()+"\t");
				System.out.print(arr.get(i).getNumber()+"\t");
				System.out.print(arr.get(i).getScoreJava()+"\t");
				System.out.print(arr.get(i).getScoreAndroid()+"\t");
				System.out.print(arr.get(i).getScoreWeb()+"\t");
				System.out.println();
			}
		}
		
		System.out.println("==============================================");
	}
	public void __3__(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		boolean breaker = true;
		String s = sc.next();
		System.out.println("==================전체조회========================");
		for (int i=0; i<arr.size(); i++) {
			if (s.equals(arr.get(i).getName())) {
				System.out.print(arr.get(i).getName()+"\t");
				System.out.print(arr.get(i).getNumber()+"\t");
				System.out.print(arr.get(i).getScoreJava()+"\t");
				System.out.print(arr.get(i).getScoreAndroid()+"\t");
				System.out.print(arr.get(i).getScoreWeb()+"\t");
				System.out.println();
				breaker = false;
				break;
			}
		}
		if (breaker) {
			System.out.println("검색한 이름의 정보가 없습니다.");
		}
		
		System.out.println("==============================================");
	}
}
