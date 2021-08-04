public class InterfaceTest10 {
	public static void main(String[] args) {
		RemoteControl rc;
		rc=new Audio(); //업캐스팅
		rc.turnOn();
		rc.setVolume(8);
		rc.setMute(true);
		rc.setMute(false);
		rc.setMute(true);
		RemoteControl.changeBattery(); //인터페이스.정적메서드()로 바로 호출
		rc.setMute(false);
		rc.setVolume(10);
		rc.turnOff();
	}
}
