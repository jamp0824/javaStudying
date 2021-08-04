
public class Audio implements RemoteControl {
	private int volume;
	private boolean mute; //멤버변수 기본값이 false

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}//turnOn


	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
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
		System.out.println("현재 Audio 볼륨크기: "+this.volume);
	}//setVolume


}
