package package02;

import package01.A2;
public class D2 extends A2{
	public D2() {
		super(); //A2클래스의 기본생성자 호출
		this.field="값";
		this.method(); //A2클래스의 protected 접근제어자로 선언된 생상자,멤버변수,메서드는 상속받은
		//자손클래스에서는 외부 패키지 폴더에서 접근가능하다.
	}

}
