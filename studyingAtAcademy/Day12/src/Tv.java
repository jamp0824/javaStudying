
public class Tv implements RemoteControl {
	private int volume;
	private boolean mute;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}//turnOn
	

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}//turnOff

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { //볼륨이 10보다 크면
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume= RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV 볼륨크기: "+this.volume);
	}//setVolume


	@Override
	public void setMute(boolean mute) {
		this.mute=mute;
		if(mute==true) {//==true는 생략가능
			System.out.println("Audio는 무음처리합니다.");
		}else {
			System.out.println("Audio 무음 해제합니다.");
		}//if else 
	}//setMute()

}
