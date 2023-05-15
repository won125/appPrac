package javaSpecial;

public interface Storage<T> {
	//추상 메서드
	public void add(T item, int index);
	public T get(int index);
	

}
