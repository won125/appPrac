package javaClass;

public class Television implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV¸¦ Åµ´Ï´Ù.");
		
	}
	
	@Override
	public void set_volume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("ÇöÀç TV º¼·ý : " + this.volume);
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
		
	}

	@Override
	public void up_chennel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void down_chennel() {
		// TODO Auto-generated method stub
		
	}

}
