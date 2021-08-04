abstract class Abs04{
	abstract void m01(); //추상메서드 정의=>{}가 없고, 실행문장이 없고, 호출이 불가능

	void m02() {
		System.out.println("m02() 일반메서드");
	}
}//Abs04 class
class SubClass04 extends Abs04{

	@Override
	void m01() {
		System.out.println("조상 추상클래스 추상메서드 오버라이딩");
	}
	
	
	
/* 1.조상 추상클래스 Abs04를 상속받은 자손클래스는 반드시 조상 추상클래스의 추상메서드를 오버라이딩을 해야  
 *   자손클래스로 객체생성이 가능하고,컴파일 에러가 나지 않는다
 */
}
public class AbsTest03  {

	public static void main(String[] args) {
		Abs04 abs; //조상 추상클래스로 참조변수 선언가능
		abs= new SubClass04(); //업캐스팅이 가능함.
		abs.m01(); //오버라이딩 된 메서드 호출
		abs.m02(); //상속받아서 호출
	}

}
