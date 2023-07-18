package 도서관리프로그램;

import java.util.ArrayList;

public class Controller {
	/**
	 * View랑 Model(DAO) 소통할 수 있는 중간다리
	 * 
	 * 도서등록: 
	 * Main에서 보내준 VO를 받아서 DAO로 보내주는 역할
	 */
	public void insert(BookVO vo) {
		BookDAO dao = new BookDAO();
		int row = dao.insert(vo);
		if (row>0) {
			System.out.println("도서등록 성공");
		} else {
			System.out.println("도서등록 실패");
		}
	}
	
	public void select() {
		BookDAO dao = new BookDAO();
		ArrayList<BookVO> booklist = dao.select();
		System.out.println("책이름\t책저자\t책가격\t책번호");
		for (int i=0; i < booklist.size();i++) {
			System.out.print(booklist.get(i).getTitle() + "\t");
			System.out.print(booklist.get(i).getName() + "\t");
			System.out.print(booklist.get(i).getPrice() + "\t");
			System.out.print(booklist.get(i).getNum() + "\t");
			System.out.println();
		}
		
	}

	public void search(BookVO vo) {
		BookDAO dao = new BookDAO();
		int cnt = dao.search(vo);
		if (cnt>0) {
			System.out.println("도서검색 성공");
		} else {
			System.out.println("도서검색 실패");
		}
		
	}
}
