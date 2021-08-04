interface IHello{
/* 인터페이스 특징) 
 *  1.인터페이스는 interface 예약어로 정의한다.
 *  2.인터페이스에 오는 추상메스드는 public abstract으로 인식된다.
 *  3.추상메서드는 {}가 없고, 실행문장이 없고, 호출할 수 없습니다.
 *  4.인터페이스는 new 예약어로 객체 생성을 못한다.
 *  5.조상인터페이스를 자손클래스에서 implements(구현) 예약어로 구현상속받는다.
 */
	void hello(String name); //public abstract이 생략된 추상메서드
}
class Hello implements IHello{
	String name;
	Hello(String name){
	this.name=name;
	}
	@Override
	public void hello(String name2) {
		System.out.println(name+"씨 안녕");	//name 앞에 this.이 생략됨
		System.out.println(name2+"분 방가워요.");
	}
	
}
public class InterfaceTest01 {
	public static void main(String[] args) {
		IHello ih; //인터페이스로 참조변수를 선언가능
		ih=new Hello("홍길동"); //업캐스팅
		ih.hello("이순신" );
	}

}
