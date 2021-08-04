public class OprData01 {
	public static void main(String[] args) {
/*수학/산술 연산자 종류)
 * +(덧셈), -(뺄셈), *(곱셈), /(나누셈: 정수 숫자를 나누면 몫만 구함. 정수 숫자를 0으로 나누면 예외 오류가 
 * 발생함. 실수숫자를 나눗셈하면 몫과 나머지를 함께 구함. %(나머지)
 * 
 */
		int a=10, b=4,re=0;	//3개변수를 한꺼번에 선언하고 초기화(변수를 선언하고 최초값을 저장하는 것을 말함)
		
		re=a+b;	//14
		System.out.println(a+"+"+b+"="+re); //+는 문자열 연결 연산기호
		
		re=a-b;	//6
		System.out.println(a+"-"+b+"="+re);
		
		re=a*b; //40
		System.out.println(a+"*"+b+"="+re);
		
		re=a/b; //2
		System.out.println(a+"/"+b+"="+re);
		
		re=a%b; //2
		System.out.println(a+"%"+b+"="+re);
		
		System.out.printf("%d/%f=%f %n",a,(float)b,a/(float)b); //2.500000
/*		%d는 십진수 정수 출력형태, %f는 십진수 실수 숫자 출력형태이다. 기본으로 소수점 6자리까지 표현되고 소수점 7자리에서
 * 		반올림한다.
 * 		int/float->10/4.0f->더 큰타입으로 변환하는 자동형변환(자동산술법)에 의해서->10.0f/4.0f -> 
 * 		실수 숫자를 나눗셈하면 몫과 나머지를 함께 구함->2.5f->%f->2.500000f
 * 		%n은 줄바꿈
 */
	
		System.out.println("산술/수학연산자");
	}

}
