package ClassConfirmEx;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		Car.Enfine engine = new Car.Enfine();
			
	}

}
