
public class DataEx09 {

	public static void main(String[] args) {

		float f1= 1F; //A
		//float f2=1.0; //B 1.0은 double 실수숫자타입값은 float 타입변수에 저장못함 명시적 형변환 해줘야됨
		//||변수타입 float형은 f를 뒤에 붙여줘야된다
		float f3='1'; //C=>자동형변환(자동산술법)=>byte->short(char)->int->long->float->double
		//타입 크기순으로 형변환.
		//float f4="1";//D	D=>"1"는 문자열 참조타입이다. 기본타입과 참조타입간의 형변환은 안됨.
		//float f5=1.0d; //E	변수타입 double값은 자동형변환이 안된다. 명시적형변환은 가능
								//왼쪽 가수부 정밀도 7자리 오른쪽 가수부 정밀도 15자리
	}

}
