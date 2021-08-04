public interface RemoteControl {
	//정적상수만 올수 있다.
	int MAX_VOLUME = 10; //최대볼륨값=>public static final이 생략된 정적상수
	public static final int MIN_VOLUME= 0; //최소 볼륨
	
	//추상메서드
	public abstract void turnOn(); //public abstract가 생략된 추상메서드
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	//자바 8에서 추가된 디폴트 메서드
	default void setMute(boolean mute) {
		if(mute) {//==true가 생략됨
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	//인터페이스 자바 8부터 올수 있는 정적메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
		
	}
}
