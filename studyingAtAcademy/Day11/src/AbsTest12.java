import net.daum.model.Animal;
import net.daum.model2.Cat;
import net.daum.model2.Dog;

public class AbsTest12 {

	public static void main(String[] args) {
		/*	문제) 1. net.daum.model 패키지에는 Animal이라는 추상클래스를 정의하고 추상메서드 sound()를 정의한다.
		 * 	2. net.daum.model2패키지에는 Animal이라는 추상클래스를 상속받은 첫번째 자손클래스 Dog를 만들고 추상메서드를 오버라이딩 한다음
		 *  실행문장으로 멍멍 이 출력되는 코드를 완성한다.
		 *  3. net.daum.model2 패키지에 Animal이라는 추상클래스를 상속받은 두번째 자손클래스 Cat을 만들고 추상메서드를 오버라이딩 해서 실행문장으로
		 *  야옹이 출력되는 코드를 완성한다.
		 *  4. main()에서 배열크기 2인 Animal 클래스 객체배열 arr을 생성하고 각 배열원소로 자손클래스 객체를 저장한 다음 일반 for반복문을 사용해서
		 *  각각의 출력문장을 출력되게 합니다.
		 */
		Animal[] arr = new Animal[2];
		arr[0]=new Cat();
		arr[1]=new Dog();
		for(int i =0;i<arr.length;i++) {
			arr[i].sound();
		}
		/* 문제) Animal 타입 참조변수 a를 선언하고 각각의 자손을 업캐스팅 한다음 다시 instanceof연산자를 활용하여
		 * 다운캐스팅을 하여 오버라이딩을 한 메서드를 호출해서 멍멍,야옹을 출력되게 합시다.
		 */
		Animal a =new Cat();

		if(a instanceof Cat) {
			Cat c =(Cat)a;
			c.sound();
		}
		a= new Dog();
		if(a instanceof Dog) {
			Dog d = (Dog)a;
			d.sound();
		}
		System.out.println("=============>");
		ref(new Dog()); ref(new Cat());

	}
	static void ref(Animal a) {//다형성
		a.sound();
	}


}
