package controller;

import file.fileDAO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileDAO dao = new fileDAO();
		int cnt = dao.upload("test1", "test2");
		
	}

}
