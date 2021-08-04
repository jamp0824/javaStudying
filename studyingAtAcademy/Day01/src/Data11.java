public class Data11 {
	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		//byte result = a + b; 덧셈 연산시 자동 형변환으로 int에서 byte로 형변환 할 수 없다. 오버플로우 현상
		//byte result =(byte)(a+b); //명시적 형변환으로 int에서 byte값을 강제적 변환을 시킨다.
		//ㄴ위코드는 byte강제 형변환으로 속도가 느리기 때문에 아래 코드가 연산속도가 빠르기에 아래코드로 사용하는게 낫다.
		int result=a+b;
/*
 *  문제1) 컴파일 에러를 디버깅해서 작동되는 프로그램으로 만든다. 에러난 이유도 주석문 처리한다.
 *  애러 잡는 방법이 몇가지 경우의 수가 나온다. 아시는 대로 기술한다.
 *
 *	byte+byte는 자동산술법에 의해서 가장 덧셈 연산 속도가 빠른 int형으로 자동형변환 해서 덧셈연산을 수행한다.
 *	결국 int+int=int 결과로 나온다. 
 */
		System.out.println("result="+result);
	
		char ch01='A';
		char ch02=1;
		int result01 = ch01+ch02;
		char result02 = (char)result01;
		System.out.println("ch01+ch02="+result01);
		System.out.println("result01의 단일문자: "+result02);
		
/*  문제 2) ch01+ch02 덧셈연산을 수행한 결과값 66을 출력하게 하고, 이 값을 캐스팅해서 단일문자 B를 출력하게
 *  한다. 추가코드 완성시킨다.
 * 
 */
	}
}
