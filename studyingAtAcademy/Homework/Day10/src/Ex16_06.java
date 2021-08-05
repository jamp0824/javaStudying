class TestSuper{
	TestSuper(){}// 오버로딩된 생성자를 자바 컴파일러는 생성자를 묵시적 제공하지 않는다. 생성자를 추가 해줘야 컴파일 에러가 나지 않는다.
	TestSuper(int i){}
}
class TestSub extends TestSuper{}

public class Ex16_06 {
	public static void main(String[] args) {
		new TestSub();
	}

}
