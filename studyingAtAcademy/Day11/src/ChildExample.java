class Parent13{
	String nation; //국가이름

	Parent13(){
		this("대한민국");//같은 클래스내의 다른 생성자 호출
		System.out.println("Parent() call");

	}
	Parent13(String nation){
		//super();가 생략욈. 조상 Object의 기본생성자를 먼저 호출
		this.nation=nation;
		System.out.println("Parent(String nation) 생성자");
	}
}//Parent13 class

class Child13 extends Parent13{
	String name;

	Child13(){
		this("홍길동");
		System.out.println("Child13() 기본생성자");
	}
	Child13(String name){
		this.name=name;
		System.out.println("Child13(String name) 생성자");
	}
	void p() {
	System.out.println("이름:+name");
	System.out.println("국가:+nation");
	}
}

public class ChildExample {

	public static void main(String[] args) {

		Child13 ch =new Child13();
	ch.p();
	/* 문제) 보다 더 완성된 코드를 작성한다.
	 * 
	 */
}

}
