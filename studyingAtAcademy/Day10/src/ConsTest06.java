class Father06{
	void f06() {
		System.out.println("조상 클래스 메서드 f06()");
	}
}

class Child06 extends Father06{

	@Override
	void f06() {
		super.f06();
	}

	void ch06() {
		System.out.println("자손 클래스 메서드 ch06()");
	}
}
public class ConsTest06 {
	public static void main(String[] args) {

		Father06 f = new Child06(); //업캐스팅
		f.f06(); //f가 가르키는 실제 객체타입이 Child06이기 때문에 오버라이딩 된 메서드를 호출
		Father06 f2 = new Father06();
		f2.f06(); //조상클래스 메서드 호출
		Child06 ch=(Child06)f; //다운캐스팅
		ch.f06();
		ch.ch06();
	}

}
