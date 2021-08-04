
public class Data04 {

	public static void main(String[] args) {
		byte a=1;
		short b=128;
		int c=32768;
		
		b=a; //1바이트 크기가 2바이트 short 타입으로 자동형변환
		System.out.println(b);	//1
		
		b=(short)c; //(형변환 즉 캐스팅연산자)를 활용하여 명시적인 강제형변환. 4바이트 int를 2바이트 short
		//형으로 형변환을 한다. short 범위 최대값을 벗어난 값이 저장됨. short 범위 최대값을 벗어난 음의 최소값이 저장됨.
		System.out.println("벗어난 값:"+b); //-32768
		
		double d=23.7; //접미사 d,D 가 생략됨
		float e=23.7f;
		System.out.println(d);
		System.out.println(e);
		
		
	}
}
