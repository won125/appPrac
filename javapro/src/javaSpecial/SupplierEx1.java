package javaSpecial;

import java.util.function.IntSupplier;

public class SupplierEx1 {

	public static void main(String[] args) {
		IntSupplier ins = () -> {
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		
		int dice = ins.getAsInt();
		System.out.println("주사위 값 = "+dice);

	}

}
