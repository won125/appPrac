package javaClass;
//리모콘
public interface RemoteControl {
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메서드
	void turnOn();//전원 on
	void turnOff();//저원 off
	void up_chennel();
	void down_chennel();
	void set_volume(int volume);
	//디폴트메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	//정적메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
