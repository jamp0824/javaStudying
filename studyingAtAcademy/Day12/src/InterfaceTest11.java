interface Vehicle{
	void run();
}
class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	public void checkFare() {
	System.out.println("승차요금을 체크합니다.");
	}
}
class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}
class Driver{
	void drive(Vehicle vehicle) { //다형성=> 상속+업캐스팅(모든 자손타입을 받을 수 있다.)
		if(vehicle instanceof Bus) {//다운캐스팅 가능하면 참
			
		Bus bus = (Bus)vehicle;
		bus.checkFare();
		}
		vehicle.run(); //업캐스팅 이후에 오버라이딩 된 메서드 호출
	}
}
public class InterfaceTest11 {
	public static void main(String[] args) {
		Driver driver= new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		driver.drive(bus);
/*	문제) 버스는 손님 고객이 탈때 승차요금 체크를 합니다. driver.drive(bus);를 호출할 때 해당 메서드에서 
 *  어떤 자바 코드를 하여 해당메서드를 호출해 승차요금 체크를 해주는 코드를 작성하세요.
 * 
 */
	}

}
