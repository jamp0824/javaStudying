class Container<T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}
public class Generic08 {
	public static void main(String[] args) {
		Container<String> con1= new Container<>();
		con1.set("홍길동");
		String str= con1.get();
		System.out.println(str);
		
		Container<Integer> con2= new Container<>();
		con2.set(10);
		int value=con2.get();
		System.out.println(value);
/*	문제) 제네릭 클래스 Container를 만들고 멤버 변수 t를 정의하고,setter(),getter()메서드를 만들어줘라
 * 
 * 
 */
	}
}
