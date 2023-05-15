package javaClass;

import java.io.Serializable;

public class smartTelevision implements RemoteControl, Searchable{

	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url + "를 겁색합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 킵니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다.");
		
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
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
		
	}	

}
