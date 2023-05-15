package javaClass;
// 사각형 면적 클래스
public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width,	int height) throws Exception{
		if(this.width<=0 || height<=0) {
			throw new Exception("너비와 높이는 플러스 값이어야 합니다.");
		}
		this.height = height;
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) throws Exception {
		if(width<=0) {
			throw new Exception("너비는 음수 또는 0 이될 수 없습니다.");
		}
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) throws Exception {
		if(height<=0) {
			throw new Exception("높이는 음수 또는 0 이될 수 없습니다.");
		}
		this.height = height;
	}

	int getArea() {
		return width * height;
	}
	
	void printRectangle() {
		System.out.println("사각형의 너비 : "+this.width);
		System.out.println("사각형의 높이 : "+this.height);
	}

}
