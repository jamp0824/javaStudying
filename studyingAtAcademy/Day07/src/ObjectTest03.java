class Car03{
	//필드,속성,멤버변수 => 클래스 소속 멤버변수
	String company="현대자동차";
	String model="그랜져";
	String color="검정";
	int maxSpeed=350;
	int speed;
	
}
public class ObjectTest03 {

	public static void main(String[] args) {
		Car03 myCar = new Car03();
		
		System.out.println("자동차 제조회사:"+myCar.company);
		System.out.println("모델명:"+myCar.model);
		System.out.println("차색상:"+myCar.color);
		System.out.println("최고속도:"+myCar.maxSpeed);
		System.out.println("현재속도:"+myCar.speed); //int 타입 멤버변수 speed 기본값은 0
		
		myCar.speed=70;
		System.out.println("현재 차 주행속도"+myCar.speed);
		}
}
