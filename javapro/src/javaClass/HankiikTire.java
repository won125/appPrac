package javaClass;

public class HankiikTire extends Tire{
	//필드
	//생성자
	public HankiikTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		accmulatedRotation++;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location+"HankookTire 수명 :"+(maxRotation-accmulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" HankookTire 펑크 ***");
			return false;
		}
	}

}
