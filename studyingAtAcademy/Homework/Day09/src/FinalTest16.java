class Airplane{
	public void land() {
		System.out.println("착륙합니다.");
		
	}
	public void fly() {
		System.out.println("일반 비행합니다.");
		
	}
	public void takeOff() {
		System.out.println("이륙합니다.");
		
	}
	
}//AirPlane

class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1; //정적상수
	public static final int SUPERSONIC=2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			
			super.fly();	//조상클래스 메서드 호출
		}
	}
	
	
	
	//fly() 메서드를 이클립스 메뉴로 오버라이딩을 각자 하세요.
}
public class FinalTest16 {
	public static void main(String[] args) {
		SupersonicAirplane sa=new SupersonicAirplane();
		sa.takeOff();	//각각 상속받아서 호출ㅇ
		sa.fly(); 		//오버라이딩 메서드 호출
		sa.flyMode= SupersonicAirplane.SUPERSONIC;
		sa.fly(); 
		sa.land();      //상속받아서 호출
	}

}
