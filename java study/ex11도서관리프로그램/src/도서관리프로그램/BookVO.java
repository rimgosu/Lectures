package 도서관리프로그램;

public class BookVO {
	/**
	 * 제목, 저자, 가격, 번호
	 */
	private String title;
	private String name;
	private int price;
	private String num;
	
	public BookVO(String title, String name, int price, String num) {
		super();
		this.title = title;
		this.name = name;
		this.price = price;
		this.num = num;
	}
	
	public String getTitle() {
		return title;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getNum() {
		return num;
	} 
}
