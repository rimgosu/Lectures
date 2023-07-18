package 상품관리프로그램;

public class Product {
	private String name;
	private int unitPrice;
	private int amount;
	public String getName() {
		return name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public int getAmount() {
		return amount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Product (String name, int unitPrice, int amount) {
		this.name= name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	public Product () {
		
	}
}
