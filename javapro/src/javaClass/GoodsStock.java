package javaClass;

public class GoodsStock { // 상품 재고 클래스
	String goodsCode; // 상품 식별 코
	int stockNum; // 재고량
	
	void AddStock(int stock) { // 상품 입고 매서드
		stockNum+=stock;
	}
	
	int SubtrakStock(int stock) { // 상품 출고 매서드
		if(stockNum<stock) {
			return 0;
		}
		stockNum-=stock;
		return stock;
	}
	

}
