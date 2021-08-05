public class A3 {
	int field1; //인스턴스 변수
	void method1() {}//인스턴스 메서드
	
	static int field2; //정적변수 
	static void method2() {} //정적메서드
	
	//인스턴스 멤버클래스에서는 외부클래스의 인스턴스변수,메서드,정적변수(메서드)에 모두 접근 가능하다.
	class B{
		void method() {
			field1=10; method1();field2=10;method2();
		}
	}//A3$B.class
	
	//정적멤버 클래스에서는 외부클래스의 인스턴스 변수,메서드에는 접근 못한다.
	static class C{
		void method() {
			//field1=10;
			//method1();
			field2=10;
			method2();
			
		}
	}//A3$C.class
}
