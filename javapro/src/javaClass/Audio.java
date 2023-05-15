package javaClass;

public class Audio implements RemoteControl{

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
		
	}

	@Override
	public void up_chennel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void down_chennel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set_volume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
		
	}

}
