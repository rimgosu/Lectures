package 상품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void __1__(ArrayList<Product> array) {
		Scanner sc = new Scanner(System.in);
		System.out.print("물건 이름 :");
		String name = sc.next();
		System.out.print("단가 :");
		int unitPrice = sc.nextInt();
		System.out.print("수량 :");
		int amount = sc.nextInt();
		Product x = new Product(name, unitPrice, amount);
		array.add(x);
	}
	public static void __2__(ArrayList<Product> array) {
		System.out.println("제품명\t단가\t수량");
		int sum =0;
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i).getName()+ "\t" +
						       array.get(i).getUnitPrice()+ "\t" +
						       array.get(i).getAmount());
			sum+= array.get(i).getUnitPrice()*array.get(i).getAmount();
		}
		System.out.println("판매 시 매출 : "+ sum+"원");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean breaker = false;
		Scanner sc = new Scanner(System.in);
		Product[] classArr = new Product[5];
		
		ArrayList<Product> list = new ArrayList<>();
		
		
		int i=0;
		while (true) {
			System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >>");
			int inputNum = sc.nextInt();
			
			switch(inputNum) {
			case 1:
				__1__(list);
				i++;
				break;
			case 2:
				__2__(list);
				break;
			case 3:
				System.out.println("프로그램 종료");
				breaker =true;
				break;
			}
			if (breaker) {
				break;
			}
			
		}
		
		
	}

}
