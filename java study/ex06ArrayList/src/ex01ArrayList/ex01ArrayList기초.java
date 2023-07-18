package ex01ArrayList;

import java.util.ArrayList;

public class ex01ArrayList기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList를 사용해보자
		// : 가변 배열
		
		// 1. ArrayList 선언 및 초기화 진행하기
		ArrayList<String> name = new ArrayList<>();
		// object : 상속
		// object로 데이터를 받아서 String으로 자동 형변환 하는중...
		
		// ctrl+shift+o
		// <> : 제네릭
		// 반드시 레퍼런스 형 변수만 들어갈 수 있다.
		// ex) int, float, double xx
		// ex) Stirng, Integer, Float, ... oo
		
		// 2. 데이터 추가하기 name.add()
		// 1) add(데이터값)
		// 2) add(인덱스 값, 데이터 값) (오버로딩)
		name.add("조자연");
		name.add("송승호");
		name.add("박병관");
		name.add(1,"박호용");
		
		// 3. 데이터 가져오기
		// get(index)
		System.out.println(name.get(3));
		
		// for문 사용해서 전체 데이터 꺼내기
		// ArrayList의 크기 : .size()
		for (int i=0; i <name.size(); i++) {
			System.out.println(name.get(i));
		}
		
		// for문 안쓰고 꺼내기
		// name.toString()
		System.out.println(name.toString());
		
		// 4. 데이터를 삭제하자
		// 1) 선택해서 삭제
		// name.remove(2);
		// 2) 전체 삭제
		// name.clear();
		name.remove(2);
		System.out.println(name.toString());
		name.clear();
		System.out.println(name.size());
	}

}
