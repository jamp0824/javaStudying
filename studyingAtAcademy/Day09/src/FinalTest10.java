class Car10{
	//멤버변수(필드,속성)=>인스턴스변수
	private int speed;
	private boolean stop; //boolean 타입 멤버변수 기본값은 false
	//boolean 타입 멤버변수의 getter()메서드명 접두어는 get으로 시작하지 않고 is로 시작하는 것이 관례이다.

	//기본 생성자가 생략

	public int getSpeed() { //getter()메서드라고 통칭
		return speed;
	}
	public void setSpeed(int speed) { //setter()메서드라고 통칭
		if(speed<0) {
			this.speed=0;
			return; //해당 메서드 종료
		}else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed =0;
	}


}
public class FinalTest10 {
	public static void main(String[] args) {
		Car10 car=new Car10();
		
		car.setSpeed(-50);
		System.out.println("현재차속도:"+car.getSpeed());
		car.setSpeed(60);
		
		if(!car.isStop()) {//!false=true
			car.setStop(true);
		}
		System.out.println("현재차속도:"+car.getSpeed());
	}

}
