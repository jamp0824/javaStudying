class A{
	public A() {
		System.out.println("hello from a");
	}
}
class B extends A{
	public B() {
		super(); //Constructor call must be first statement in a constructor.  
		System.out.println("hello from b");
	}
}
public class Ex16_09 {

}
