class Parent11{
	String field;
	
	public void method01() {
		System.out.println("Parent11 method01()");
		
	}
	public void method02() {
		System.out.println("Parent11 method02()");
	}
}
class Child11 extends Parent11{
	String field2;
	
	public void method03() {
		System.out.println("Child11 method03()");
	}
/* 문제) 업캐스팅한 p01객체를 생성해서 부모클래스를 메서드를 호출하고, instanceof 연산자를 활용해 p01이 다운
 * 캐스팅이 가능한지를 확인한 후 부모클래스 메서드를 상속받아서 호출하고, 자손클래스 메서드를 호출해 봅시다
 */
}
public class ConsTest11 {
	public static void main(String[] args) {
		
		Parent11 p01=new Child11();
		p01.method01();
		p01.method02();
		if(p01 instanceof Child11) {
			Child11 ch=(Child11)p01;
			ch.method01();
			ch.method02();
			ch.method03();
		}
	}

}
