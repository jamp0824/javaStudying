class Father06{
	public Father06() {
		super();//묵시적 생략을 해도 된다. 조상클래스 Object 기본생성자를 호출
		System.out.println("Father06() 생성자 호출");
	}
}
class Child06 extends Father06{
	public Child06() {
		//super();이 생략됨=> 조상 Father06() 기본생성자를 먼저 호출
		System.out.println("Child06() 생성자 호출");
	}
}
public class FinalTest06 {
	public static void main(String[] args) {
		 new Child06(); //기본생성자 호출
		
	}

}
