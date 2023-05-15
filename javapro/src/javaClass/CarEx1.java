package javaClass;

public class CarEx1 {

	public static void main(String[] args) {
		Car chulsuCar = new Car();
		
		for(int i=1;i<=7;i++) {
			int problemLocation = chulsuCar.run();
			if(problemLocation!=0) {
				System.out.println(chulsuCar.tires[problemLocation-1].location + "HankookTire로 교체");
				chulsuCar.tires[problemLocation-1] = new HankiikTire(chulsuCar.tires[problemLocation-1].location, 15);
			}
			/*
			 switch(problemLocation) {
			 
			case 1:
				System.out.println("앞 왼쪽 KumhoTire로 교체");
				chulsuCar.frontLeftTire = new KumhoTire("앞 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				chulsuCar.frontRightTire = new KumhoTire("앞 오른쪽", 12);
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				chulsuCar.BackLeftTire = new HankiikTire("뒤 왼쪽", 10);
				break;
			case 4:
				System.out.println("뒤 오른쪽 HankookTire로 교체");
				chulsuCar.BackRightTire = new HankiikTire("뒤 오른쪽", 13);
				break;
			}
			*/
			System.out.println("--------------------------------");
		}

	}

}
