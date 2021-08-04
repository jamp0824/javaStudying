class Parent12{

}
class Child12 extends Parent12{

}
public class ConsTest12 {
	static void method01(Parent12 p) {
		/* 문제) instanceof 연산자를 사용해서 true이면 다운캐스팅 성공이라는 문자열을 출력하고 false이면 다운캐스팅 변환 실패라는 메시지를 출력되게한다.
		 */
		if(p instanceof Child12) {
			System.out.println(" 다운캐스팅 성공");
		}else {
			System.out.println(" 다운캐스팅 실패");
		}
	}
	public static void main(String[] args) {
		Parent12 parentA = new Child12(); //업캐스팅
		method01(parentA);

		/* 문제) 다운캐스팅 실패가 출력되게 parentB를 생성해서 인자값으로 전달하자.
		 * 
		 */
		Parent12 parentB= new Parent12();
		method01(parentB);
		System.out.println("============");
		method01(new Parent12());
	}

}
