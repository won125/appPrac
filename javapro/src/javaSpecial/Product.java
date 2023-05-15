package javaSpecial;

public class Product<T, M> {
	private T kind;//제품 종류
	private M model;//제품 모델명
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
		
}
