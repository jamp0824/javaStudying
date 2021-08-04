class Car06{
	int speed; //차속도=> 멤버변수 중 인스턴스변수(필드,속성)
	
	//기본 생성자 생략
	int getSpeed() {//get+멤버변수명().접미사 멤버변수명 첫글자는 관례적으로 영문대문자=> 값반환 메서드 
					//getter()메서드라고 통칭
		return speed;
	}
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}//keyTurnOn()
	void run() {
		for(int i=10;i<=50;i+=10) { //10씩 증가
			speed= i;
			System.out.println("달립니다.(시속: "+speed+"km/h)");
		}//for
	}//run()
	
}
public class ConsTest06 {
	public static void main(String[] args) {
		Car06 myCar = new Car06();
		myCar.keyTurnOn();
		int speed=myCar.getSpeed(); //현재 차속도
		System.out.println("현재 차속도="+speed+"km/h");
		 myCar.run();
		 speed=myCar.getSpeed(); //현재 차속도
		System.out.println("현재 차속도="+speed+"km/h");
	}

}
