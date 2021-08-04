class A09{
	A09(){
		//super();가 생략됨 => 조상 Object클래스의 기본생성자를 먼저 호출, 항상 첫줄에 기입
		System.out.println("A09 조상클래스 생성자");
	}
}
class B09 extends A09{
	B09(){
		super(); //Super()는 항상 생성자{}블록내의 실행문장에서 항상 첫줄에 나와야 한다.
		System.out.println("B09 자손클래스 생성자");
	}
}
public class SubEx16_09 {
	public static void main(String[] args) {
		new B09(); //기본생성자 호출
		
	}

}
