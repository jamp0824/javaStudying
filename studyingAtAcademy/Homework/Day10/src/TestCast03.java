public class TestCast03 {

	public static void main(String[] args) {
/* 다운캐스팅 회원관리 로그인 서비스에서 많이 이용된다
 * 	매개변수 타입이 Object인 경우가 많다. 	
 */
		Father01 f = new Child01(); //사전에 업캐스팅
		Child01 ch;
		ch =(Child01)f; //다운캐스팅
		
		ch.f01(); //상속받아서 호출
		ch.ch01(); //자손클래스 메서드 호출
		
		Child01 ch2 =(Child01)f; //명시적인 다운캐스팅
		ch2.f01();
		ch2.ch01();
		
	}

}
