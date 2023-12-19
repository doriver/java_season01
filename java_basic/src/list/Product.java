package list;

public class Product {
	private String name;
	private int price;
	private int stock;
	
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString () {
		return "(" + name + "가격 : " + price + ", 재고 : " + stock + ")";
		
	}
	
}
