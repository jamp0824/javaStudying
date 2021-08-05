class Base{
	Base(){
		super();//자바 컴파일러가 기본제공함=>Object 최고 조상클래스의 기본생성자를 호출
		System.out.println("Base");
	}
}
class Alpha extends Base{
	//기본생성자 생략됨
}

public class Ex16_07 {
	public static void main(String[] args) {
		new Alpha(); 	//자손클래스 기본생성자 호출
		new Base();
	}

}
