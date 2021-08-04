import net.daum.model.Soundable;
import net.daum.model2.Cat;
import net.daum.model2.Dog;

public class InterfaceTest14 {
	public static void main(String[] args) {
/*	문제) 1. net.daum.model패키지를 생성하고 Soundable 인터페이스를 정의하고 추상메서드로 String sound();
 * 		를 생성한다.
 *		 2. net.daum.model2패키지를 생성하고 Soundable 인터페이스를 구현상속한 자손클래스 Cat,Dog를 생성한다.
 *		그리고 오버라이딩 된 메서드 실행문장 결과로 야옹, 멍멍 출력 결과물이 나오게 코드한다.
 *		 3. InterfaceTest에서 void printSound(Soundable sound){} 인스턴스 메서드를 정의하고 다형성문법을 적용해서 야옹과 멍멍
 *		을 각각 출력해본다. 
 */
		InterfaceTest14 it = new InterfaceTest14();
		it.printSound(new Dog());
		it.printSound(new Cat());
	}
	void printSound(Soundable sound) {
		System.out.println(sound.sound());
	}
}
