class Box<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	//이클립스 메뉴를 사용해서 setter(), getter()메서드를 작성해 보자.
	
}
public class Generic01 {
	public static void main(String[] args) {
		Box<String> box=new Box<>();
		box.setT("abc");
		String str=box.getT();
		System.out.println("반환된 문자열: "+str);
		
		Box<Integer> box2=new Box<>();
		box2.setT(100); //오토박싱(자바5)
		int value=box2.getT(); //오토 언박싱
		System.out.println("반환된 숫자: "+value);
	}

}
