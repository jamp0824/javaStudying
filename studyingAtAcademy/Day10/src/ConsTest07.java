class Parent07{
	int x =100;
	
	void method() {
		System.out.println("Parent07 method()");
	}
}
class Child07 extends Parent07{
	int x =200;

	@Override
	void method() {
		System.out.println("Child07의 오버라이딩 된 method()");
	}
	
	
}
public class ConsTest07 {
public static void main(String[] args) {
	Parent07 p =new Child07(); //업캐스팅
	System.out.println(); //동일 멤버변수 x가 조상/ 자손에 모두 정의된 경우 참조 변수 p타입에 의해서
	//호출되는 멤버 변수가 결정됨
	p.method(); //p는 실제 가리키는 객체 타입이 Child07이기 때문에 오버라이딩 된 메서드를 호출
	Child07 c = new Child07();
	System.out.println(c.x);
	c.method();
	Parent07 p2 = new Parent07();
	System.out.println(p2.x);
	p2.method();
}
}
