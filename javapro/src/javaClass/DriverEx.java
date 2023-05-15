package javaClass;

public class DriverEx {

	public static void main(String[] args) {
		Driver chulsu = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		chulsu.drive(bus);
		chulsu.drive(taxi);

	}

}
