class A1{}

class B1 extends A1{}
class C extends A1{}
class D extends B1{}
class E extends C{}

public class ConsTest09 {
	public static void main(String[] args) {
		B1 b = new B1();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A1 a1= b; //업캐스팅
		A1 a2= c;
		A1 a3= d;
		A1 a4= e;
		
		B1 b1=d; 
		C c1=e; 
		
		//B b3=e; //상속관계가 아니라서 업캐스팅 불가
		//C c2=d; 
		
	}

}
