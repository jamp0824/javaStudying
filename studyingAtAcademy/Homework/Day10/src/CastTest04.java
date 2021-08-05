class Father04{
	void f04() {
		System.out.println("f04() 조상클래스 메서드");
	}
}
class Child04 extends Father04{
	void ch04() {
		System.out.println("ch04() 자손 클래스 메서드");
	}
}
public class CastTest04 {
	public static void main(String[] args) {
		Father04 f  = new Father04();
		f.f04();
		Child04 ch=(Child04)f;
		/* 다운캐스팅 특징)
		 * 1. 사전에 업캐스팅을 하지 않는 상태에서 다운캐스팅을 하면 실행시 예외 오류가 발생한다.
		 */
		ch.ch04();
		ch.f04();
	}

}
