
public class OprData06 {

	public static void main(String[] args) {
/* 비교/관계 연산자 종류)
 * 	1.비교연산자 결과값은 boolean 타입이다. true or false
 *  2.>(~보다 크다), >=(~보다 크거나 같다), <(~보다 작다), <=(~보다 작거나 같다)
 *  	==(같다), !=(같지 않다)
 */
		int a=10,b=4;
		boolean re=false;
		
		re=a>b; // 10>4->true
		System.out.println(a+">"+b+" : "+re);
		
		re=a<b; // 10<4->false
		System.out.println(a+"<"+b+" : "+re);
		
		System.out.println(a+b > a-b); //14>6=> true
		
/*삼항조건연산자 형식)
 * 조건식?조건식이 참이면 실행: 조건식이 거짓이면 실행;
 * 간결한 코드를 만들어 준다
 */
		int a2=5, b2=10;
		int max=(a2>b2)?a2:b2;
		System.out.println("max = "+max);
	}
}
