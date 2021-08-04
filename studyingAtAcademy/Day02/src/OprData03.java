
public class OprData03 {

	public static void main(String[] args) {
		
		char c01='A'+1;	//65+1->66->66에 해당하는 단일문자는 'B'
/*자바는 리터럴(값) 간의 연산은 타입 변환없이 해당 타입으로 계산한다
 * 
 */	
		System.out.println("c01 : "+c01);
		char c02='A';
		char c03=(char)(c02 +1);
		System.out.println("c03 : "+c03);
/* 변수 c02+1을 하면 c2가 int타입으로 형변환해서 +1과 덧셈을 한다. 덧셈 결과값이 int타입으로 나온다. 그래서
 * char 타입변수 c03에 저장못한다.
 * 문제) 컴파일 에러를 수정하자.그리고 c03변수값을 출력한다.
 */
		System.out.println("=======>");
		
		char lowerCase='a';
/* 문제) 캐스팅(형변환)연산자와 뺄셈연산자를 활용하여 영문대문자 'A'를 구해서 char upperCase 변수에 저장한다음
 * 출력해본다.
 * 
 */
		char upperCase=(char)(lowerCase-32);
		//int-int -> 97-32=65-> 65에 해당하는
		System.out.println(upperCase);
	}
}
