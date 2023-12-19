package list;

import java.util.ArrayList;
import java.util.List;

public class List02_01 {

	public static void main(String[] args) {
		
		List<Product> pList = new ArrayList<>();
		
		Product product = new Product("나초", 1000, 140);
		pList.add(product);
		
		product = new Product("포카리", 1200, 55);
		pList.add(product);
		
		pList.add(new Product("햄", 1400, 60));
		pList.add(new Product("치즈", 500, 0));
		
		System.out.println(pList); 
		// [(나초가격 : 1000, 재고 : 140), (포카리가격 : 1200, 재고 : 55), (햄가격 : 1400, 재고 : 60), (치즈가격 : 500, 재고 : 0)]
		
		// 재고 개수 업데이트, 나초가 10개 팔림
		for (int i = 0; i < pList.size(); i++) {			
			if ( pList.get(i).getName() == "나초" ) {
				int stock = pList.get(i).getStock() - 10;
				pList.get(i).setStock(stock);
			}
		}
		System.out.println(pList);
//		if ( pList.get(0).getName() == "나초" ) {
//			int stock = pList.get(0).getStock() - 10;
//			pList.get(0).setStock(stock);
//		}
		
		
		// 재고 적은 상품 주문하려 함, 재고 57개 이하인 상품 정보
		for (int i = 0; i < pList.size(); i++) {			
			if ( pList.get(i).getStock() <= 57 ) {
				System.out.println(pList.get(i));
			}
		}
//		if ( pList.get(0).getStock() <= 57 ) {
//			System.out.println(pList.get(0));
//		}
		
		
	}
}
