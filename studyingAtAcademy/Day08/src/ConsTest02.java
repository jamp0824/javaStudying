class Car02{
	String company="현대자동차";
	String model;
	String color;
	int speed;
	
	Car02(){}
	
	Car02(String model,String color){
		this(model,color,120); //같은 클래스 내의 다른 생성자 호출
	}
	Car02(String model,String color, int speed){
		this.model=model; this.color=color; this.speed=speed;
	}
	void p() {//인스턴스(객체) 메서드는 생성된 객체에 의해 모두 공유된다.
		System.out.println("제조사: "+company);
		System.out.println("모델: "+model);
		System.out.println("색상: "+color);
		System.out.println("최대속도: "+speed);
	}
}
public class ConsTest02 {

	public static void main(String[] args) {
		Car02 c=new Car02("아반떼","파랑");
		c.p();
	}

}
