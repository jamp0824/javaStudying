/* 변수 선언법)
 * 자료형(타입) 변수명; //변수 선언
 * 변수명에 최초값을 저장하는 것을 초기화라 한다.
 * 
 * 변수란 값을 저장하는 장소
 * 
 */
public class Data03 {

	public static void main(String[] args) {
		int year=2020;	//int는 자바정수형 4바이트,=은 대입할당연산자(오른쪽 값을 왼쪽변수 year에 저장)
		int age=24; 	//;은 한문장 끝
		
		System.out.println("년도:"+year);
		System.out.println("나이:"+age);
		
		int a; 
		a=10;
		a=12;//변수 a는 한개값만 저장가능하고 마자막에 저장된 값만 남는다.
		System.out.println("a="+a); 	//+는 문자열 연결 연산자
/*
 * 자바의 기본자료형(타입) 종류)
 * 	1.정수숫자형:byte(1바이트),char(2바이트:단일문자),short(2바이트),int(4바이트),long(8바이트)
 *  2.실수 소수점 숫자형:float(4바이트),double(8바이트)
 *  3.true or false논리형:boolean (1바이트:다른 타입간 형변환을 할 수 없다.)
 *  
 *  기본타입을 제외한 나머지 자료형을 참조(레퍼런스) 타입 종류)
 *  배열형, 클래스형, 인터페이스형, 열거형
 *	변수에 저장되는 값 (리터럴)
 */
	long d=10L;
	System.out.println("d="+d);
	float e=100.5f;
	System.out.println("e="+e);
	}
}
