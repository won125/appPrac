package javaClass;

public class Car {
	//필드
	/*
	Tire frontLeftTire = new Tire("앞 왼쪽 타이어", 6);
	Tire frontRightTire = new Tire("앞 오른쪽 타이어", 4);
	Tire BackLeftTire = new Tire("뒤 왼쪽 타이어", 3);
	Tire BackRightTire = new Tire("뒤 오른쪽 타이어", 5);
	*/
	
	Tire[] tires = {
			new Tire("앞 왼쪽 타이어", 6),
			new Tire("앞 오른쪽 타이어", 4),
			new Tire("뒤 왼쪽 타이어", 3),
			new Tire("뒤 오른쪽 타이어", 5)
	};
	//생성자
	
	//매서드
	int run() {
		System.out.println("자동차가 달립니다.");
		for(int i=0;i<tires.length;i++) {
			if(tires[i].roll()==false) {
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
