class Outter2{
	String field="Outter2-field";
	
	void method() {
		System.out.println("Outter2-method()");
	}
	
	//인스턴스 멤버클래스
	class Nested{
		String field ="Nested-field";
		
		void method() {
			System.out.println("Nested-method()");
		}
		void print() {
			System.out.println(this.field); //this.field는 인스턴스 멤버 클래스의 인스턴스 변수참조합니다.
			this.method();//인스턴스 멤버클래스의 인스턴스 메서드 호출
			System.out.println(Outter2.this.field);//외부클래스의 인스턴스변수 참조
			Outter2.this.method();//외부클래스의 인스턴스 메서드 호출
		}
	}//Outter2$Nested.class
}
public class OutterExample {
	public static void main(String[] args) {
		Outter2 outter= new Outter2();
		Outter2.Nested nested=outter.new Nested();
		nested.print();
	}

}
