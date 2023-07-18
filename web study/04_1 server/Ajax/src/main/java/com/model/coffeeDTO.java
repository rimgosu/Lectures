package com.model;

public class coffeeDTO {
	private String menuNm;
	private int price;
	private String size;
	
	public coffeeDTO(String menuNm, int price, String size) {
		this.menuNm = menuNm;
		this.price = price;
		this.size = size;
	}
	
	public String getMenuNm() {
		return menuNm;
	}
	public int getPrice() {
		return price;
	}
	public String getSize() {
		return size;
	}

	// 객체 내 정보를 보여주기 위한 메소드
	@Override
	public String toString() {
		return "coffeeDTO [menuNm=" + menuNm + ", price=" + price + ", size=" + size + "]";
	}
	
	
	
}
