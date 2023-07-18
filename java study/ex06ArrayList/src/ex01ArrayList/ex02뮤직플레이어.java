package ex01ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02뮤직플레이어 {

	public static void __1__(ArrayList<String> list) {
		System.out.println("========현재 재생 목록========");
		if (list.size() == 0) {
			System.out.println("재생목록이 없습니다.");
		}
		for (int i=0; i < list.size(); i++) {
			System.out.println((i+1) + "." + list.get(i) );
		}
		System.out.println("=========================");
	}
	
	public static void __2__(ArrayList<String> list) {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >>");
		int s = sc2.nextInt();
		sc2.nextLine(); 
		switch(s) {
		case 1:
			System.out.print("추가할 노래 입력 >>");
			String addMusic = sc2.nextLine();
			list.add(addMusic);
			System.out.println("추가가 완료되었습니다.");
			break;
		case 2:
			System.out.print("추가할 노래 입력 >>");
			String addMusic2 = sc2.nextLine();
			System.out.print("추가할 위치 입력 >>");
			int where = sc2.nextInt() -1;
			list.add(where, addMusic2);
			System.out.println("추가가 완료되었습니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public static void __3__(ArrayList<String> list) {
		__1__(list);
		Scanner sc = new Scanner(System.in);
		if (list.size() != 0) {
			System.out.print("[1]선택삭제 [2]전체삭제");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("삭제할 노래 선택 >>");
				int listNum = sc.nextInt();
				list.remove(listNum);
				break;
			case 2:
				list.clear();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			__1__(list);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 노래 리스트가 저장될 ArrayList 만들기
		// "가수이름 - 노래제목" : String
		// 입력 도구도 필요
		Scanner sc = new Scanner(System.in);
		boolean breaker = false;
		ArrayList<String> musicList = new ArrayList<>();
		musicList.add("Maria");
		musicList.add("HowYouLikeThat");
		musicList.add("깡");
		musicList.add("살짝설렜어");
		while (true) {
			System.out.print("[1]노래조회 [2]노래추가 [3]노래삭제 [4]종료 >>");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				__1__(musicList);
				break;
			case 2:
				__2__(musicList);
				break;
			case 3:
				__3__(musicList);
				break;
			case 4:
				breaker = true;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			if (breaker == true ) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}

}
