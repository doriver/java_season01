package jj.list;

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
	public String toString() {
		return "(" + name + "가격 : " + price + ", 재고 : " + stock + ")";
	}
	/*
	 * 이게 없으면(toString 메서드를 Override 하지 않으면)
	 * Product클래스 인스턴스의 참조변수를 println하면 jj.list.Product@4926097b 이런식으로나옴
	 * 
	 * 위와같이 override하고
	 * Product클래스의 인스턴스의 참조변수를 println하면 (나초가격 : 1000, 재고 : 140) 이런식으로 나옴
	 */
	
}
