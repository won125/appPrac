package javabase;

public class forEx6 {

	public static void main(String[] args) {
		int pig=1,ostrich=1;
		for(pig=0;pig<=17;pig++) {
			for(ostrich=17;ostrich>0;ostrich--) {
				if(pig+ostrich==17 && pig*4+ostrich*2==56) {

					System.out.println("돼지 "+pig+"마리 "+"타조는 "+ostrich+"마리");
				}
			}
		}
		

	}

}
