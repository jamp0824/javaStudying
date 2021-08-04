/* 주석문 이란?
 * 1. 주석문이란 소스에 대한 설명문으로 실행되지 않는다.
 * 2. 주석문 종류
 *    가. // : 한줄 주석문
 *     
 */
 /* 한줄 이상 주석문 기호*/
public class Data01 { //class 예약어(키워드)로 Data01로 클래스명 정의

	public static void main(String[] args) {
		//void는 반환값이 없는 타입
		System.out.println(10);		//System.out은 모니터 출력장치와 연결. print()는 출력, ln은 줄바꿈(개행)
		System.out.println(10.5);
		System.out.println('a');	//'a'는 단일문자 a는 십진수 정수값으로 저장
		System.out.println(true);	
		System.out.println(13L);    //long정수 자료형 값 뒤에는 접미사 L(1->영문소문자)이 붙는다.
		System.out.println(10.5F);  //float타입 실수 숫자값 뒤에는 접미사 F(f)가 붙는다.
		System.out.println("홍길동"); //"홍길동"은 문자열 참조타입	
	}

}
