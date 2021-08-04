class Car08{
	String model;
	int speed;
	
	//생성자가 오버로딩이 되면 기본생성자를 묵시적 제공하지 않는다.
	
	Car08(String model){
		this.model=model;
	}
	
	void setSpeed(int speed) {
		this.speed=speed;
	}//setter()메서드 정의
	
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h)");
			//this.은 생략가능하다.
		}
	}
}
public class ConTest08 {
	public static void main(String[] args) {
		Car08 myCar=new Car08("포르쉐");
		Car08 yourCar=new Car08("벤츠");
		
		myCar.run();
		yourCar.run();
	}

}
