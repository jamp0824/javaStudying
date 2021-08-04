interface InterfaceA{
	void methodA();
}
interface InterfaceB{
	void methodB();
}
interface InterfaceC extends InterfaceA, InterfaceB{
	void methodC();
}
class Child12 implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("methodC() 실행");
	}
	
}
public class InterfaceTest12 {
	public static void main(String[] args) {
		Child12 ch=new Child12();
		
		InterfaceA ia = ch; //업캐스팅
		ia.methodA();
		System.out.println();
		
		InterfaceB ib= ch;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = ch;
		ic.methodA(); ic.methodB(); ic.methodC();
	}

}
