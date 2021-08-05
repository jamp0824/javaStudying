@FunctionalInterface
/*	1. @FunctionalInterface 애너테이션은 함수형 인터페이스로 추상메서드가 딱 한개만 올수 있다.
 *  2. 함수형 인터페이스는 자바 8에서 추가되었고, 람다식 즉 함수형 언어를 위한 인터페이스이다.
 *  3. 람다식도 자바 8에서 추가되었다.
 */
interface MyFunctionalInterface{
	void method(); //함수형 인터페이스는 추상메서드를 한개 만들어 줘야 에러가 발생하지 않는다.
}
public class FunctionTest01 {
	public static void main(String[] args) {
		MyFunctionalInterface fi; //함수형 인터페이스로 참조변수 선언가능
		
		fi= () ->{
			String result="method() 호출";
			System.out.println(result);
		};//메서드명과 리턴타입이 없는 람다식(->)
		fi.method();
		
		fi= () ->{System.out.println("두번째 method()호출");};
		fi.method();
		
		fi = () ->{System.out.println("세번째 method()호출");};
		fi.method();
	}
}
