package class_2;

public class Goods {
	private String name;
	private int price;
	private String expiration;
	
	public Goods(String name, int price, String expiration) {
		this.name = name;
		this.price = price;
		this.expiration = expiration;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getExpiration() {
		return expiration;
	}
	
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + this.getPrice());
		System.out.println("유통기한 : " + expiration);
	}
	
	public int calculatePrice(int count) {
		return price * count;
	}

	
	
}
