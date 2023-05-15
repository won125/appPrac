package javaClass;

public class AClassEx1 {

	public static void main(String[] args) {
		AClass aa = new AClass();
		AClass.BClass bb = aa.new BClass();
		bb.bfield =10;
		bb.bmethod();
		aa.aMethod();
	}

}
