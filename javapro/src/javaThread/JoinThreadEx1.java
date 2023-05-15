package javaThread;

public class JoinThreadEx1 {

	public static void main(String[] args) {
		JoinThread joinThread = new JoinThread();
		joinThread.start();
		try {
			joinThread.join();//jointhread가 종료할때까지 메인 스레드가 일시 정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1부터 100까지의 합 = "+ joinThread.getSum());
		
        

	}

}
