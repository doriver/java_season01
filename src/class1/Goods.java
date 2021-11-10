package class1;

public class Goods {

	String name;
	int price;
	String expiration;
	
	int calculationPrice(int count) {
		return price * count;
	}
	
	boolean availableSale(String date) {
		String[] expirationDate = expiration.split("-");
		String[] compareDate = date.split("-");
		
		if (Integer.parseInt(expirationDate[0]) > Integer.parseInt(compareDate[0])) {
			return true;
		} else if (Integer.parseInt(expirationDate[0]) == Integer.parseInt(compareDate[0])) {
			if (Integer.parseInt(expirationDate[1]) > Integer.parseInt(compareDate[1])) {
				return true;
			} else if (Integer.parseInt(expirationDate[1]) == Integer.parseInt(compareDate[1])) {
				if (Integer.parseInt(expirationDate[2]) > Integer.parseInt(compareDate[2])) {
					return true;
				}
			}
		}
		
		return false;
	}
}
