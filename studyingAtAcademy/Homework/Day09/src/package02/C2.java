package package02;

import package01.A2;

public class C2 {

	public void method() {
		//A2 a= new A2(); //protected 접근제어자로 선언된 A2클래스 생성자는 외부 패키지 폴더의 다른 클래스에서는
		//접근 못함.
		
		//a.field="value";
		//a.method(); //메서드, 멤버변수 모두 protected 접근 제어자로 선언했기 때문에 외부 패키지 폴더의 다른 
		//클래스에서는 접근 못함.
	}
}
