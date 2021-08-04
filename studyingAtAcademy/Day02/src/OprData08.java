
public class OprData08 {
	public static void main(String[] args) {
/* 논리 연산자 종류)
 * 1. 논리연산자 결과값도 true or false이다.
 * 2. &&(논리곱:and) : 두개의 입력값 모두 참인 경우만 참이다. 나머지 모두 거짓이다.
 *    ||(논리합:or)  : 두개의 입력값 중 한개라도 참이면 결과값은 참이다. 입력값 모두 거짓인 경우만 거짓이다.
 *    !(not) : 입력값이 참이면 결과값이 거짓이고, 입력값이 거짓이면 결과값은 참이다.
 */
		boolean result = false;
		result = (true&& true);
		System.out.println("true && ture : "+result);
		
		result = (false || false);
		System.out.println("false || false :"+false);
		
		result =! false;
		System.out.println("!false :"+result);
		
	}
}
