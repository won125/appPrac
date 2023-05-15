package javaClass;

public class Driver {
	
	//¸Å¼­µå
	public void drive(Vehicle vehicle) {
		//if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		//}
		vehicle.run();
	}

}
