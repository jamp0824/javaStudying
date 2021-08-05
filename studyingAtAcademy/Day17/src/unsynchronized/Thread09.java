package unsynchronized;

import synchronized2.Calculator;

public class Thread09 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1=new User1();// User1 스레드 객체 생성
		user1.setCalculator(calculator);
		user1.start(); //스레드 시작하고 run()메서드 호출
		
		User2 user2=new User2(); //User2 스레드 객체 생성
		user2.setCalculator(calculator);
		user2.start(); 
		
	}

}
