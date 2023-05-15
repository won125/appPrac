package javaClass;

public class CheomseongdaeEx1 {

	public static void main(String[] args) {
		Cheomseongdae cheom1 = Cheomseongdae.getIntance();
		Cheomseongdae cheom2 = Cheomseongdae.getIntance();
		
		if(cheom1==cheom2) {
			System.out.println("서로 같은 객체입니다.");
		}else {
			System.out.println("같은 객체가 아닙니다.");
		}
		
		
		cheom1.history();
		cheom2.history();

	}

}
