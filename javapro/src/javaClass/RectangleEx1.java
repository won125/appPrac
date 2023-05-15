package javaClass;

public class RectangleEx1 {

	public static void main(String[] args) {
		try {
			Rectangle rec = new Rectangle(0, 35);
			rec.printRectangle();
			System.out.println("사각형의 넓이 : "+ rec.getArea());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
