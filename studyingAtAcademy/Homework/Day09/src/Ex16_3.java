//2. 다음과 같은 상속 구조에서 생성자의 호출 순서를 알아보기 위한 문제입
//니다. 실행 결과를 유추해봅시다.(Ex16_3.java)
class Parent2{
	protected int a,b,c;

	public Parent2() {
		super();//최고 조상 Object 클래스의 기본생성자 호출=> 묵시적 생략을 할 수 있다.
		System.out.println("Parent 클래스의 디폴트 생성자 호출");
	}
	public Parent2(int a,int b,int c) {
		System.out.println("Parent 클래스의 전달인자 3개짜리 생성자 호출");
		this.a=a; this.b=b; this.c=c;
	}
}
class Child2 extends Parent2{
	public Child2() {
		System.out.println("Child 클래스의 디폴트 생성자 호출");
	}
	public Child2(int a,int b,int c) {
		super(a,b,c); //조상클래스 오버로딩 된 생성자 호출
		System.out.println("Child 클래스의 전달인자 3개짜리 생성자 호출");		}
	void print() {
		System.out.println("a="+a+"b="+b+"c="+c);
	}
}


public class Ex16_3 {

	public static void main(String[] args) {
		Child2 one= new Child2();
		one.print();
		System.out.println("===============");
		Child2 two= new Child2(10,20,30);
		two.print();
	}

}
