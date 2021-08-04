
public class Data07 {

	public static void main(String[] args) {
		
		int a=10;
		int b=012;//8진수 정수로 저장
		int c=0xA;//16진수 정수로 저장
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("========>");
		
/* 자바의 자동형 변환=> 자동산술법)
 * byte(1바이트) > short, char 각 2바이트-> int(4바이트) -> long(8바이트) -> float(4바이트)
 * -> double(8바이트) 순으로 자료형 크기가 커진다. 자동 산술법에 의한 자동형 변환이 컴파일러에 의해서 이루어 진다.
 * 예를 들면 byte + int => int+int로 연산이 이루어 진다. 
 * 
 */
		float result=10+10.5f; //10.0f+10.5f로 형변환이 되어져서 실수 숫자값이 좌측 변수에 저장됨.
		//+는 덧셈 연산
		System.out.println(result);
	}
}
