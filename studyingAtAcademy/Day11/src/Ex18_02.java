class A{
	public int method1() {
		return 0;
	}
}
	class B extends A{
		@Override 
		public int method1() {
			return 1;
		}
	}
public class Ex18_02 {
public static void main(String[] args) {
	B b = new B();
	System.out.println(b.method1());
}
}
