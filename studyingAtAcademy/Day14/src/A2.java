public class A2 {

		//인스턴스 멤버클래스
		class B{}//A2$B.class
		
		//정적멤버 클래스
		static class C{}//A2$C.class
		
		//인스턴스 변수(필드)
		B field1=new B(); 
		C field2=new C();
		
		//인스턴스 메서드
		void method1() {
			B var1=new B();
			C var2=new C();
		}
		
		//정적변수 (필드)
		//static B field3=new B(); //인스턴스 멤버클래스 B를 정적변수 초기값으로 사용못함.
		static C field = new C();
		
		//정적메서드
		static void method2() {
			//B var1= new B(); //인스턴스 멤버클래스 B를 정적메서드내에서 객체 생성 못함.
			C var2= new C();
		}
}
