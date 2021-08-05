

class A{
	A(){
		System.out.println("A 객체가 생성됨");
	}//기본생성자

	/*인스턴스 멤버 클래스 정의*/
	class B{
		B(){
			System.out.println("B 객체가 생성됨.");
		}
		int field1; //인스턴스변수 올수있다.
		//static int field2; //정적변수는 올수 없다.
		void method1() {} //인스턴스 메서드는 올수 있다.
		//static void method2{}//정적메서드는 올수 없다.
	}//A$B.class 컴파일됨.

	/*정적 멤버 클래스*/
	static class C{
		C(){System.out.println("C객체가 생성됨.");}
		int field1; //인스턴스 변수가 올수 있다.
		static int field2; //정적 변수가 올수 있다.
		void method1() {} //인스턴스메서드 올수 있다.
		static void method02() {} //정적메서드가 올수 있다.
	}//A$C.class

	void method01() {
		/*로컬(지역) 클래스*/
		class D{
			D(){System.out.println("D 객체가 생성됨.");}
			int field1; //지역클래스에서는 인스턴스 변수가 올수 있다.
			//static int field2; //정적 변수는 올수 없다
			void method1() {System.out.println("D 메서드가 생성됨.");}	//인스턴스메서드는 올수 있다.
			//static void method2() {} //정적메서드는 올수 없다.
		}//A$1D.class
		D d = new D();
		d.method1();
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.method01();

		//인스턴스 멤버클래스 객체 생성
		A.B b =a.new B();
		b.field1=10;
		b.method1();

		//정적멤버 클래스 객체 생성
		A.C c =new A.C();
		c.field1=3; c.method1();
		A.C.field2=10;
	}

}
