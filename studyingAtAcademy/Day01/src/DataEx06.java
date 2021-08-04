
public class DataEx06 {
	public static void main(String[] args) {
		byte b=127;
		byte c=126;
		int d=b+c;
		//byte d= b+c; //int+int로 자동형 변환해서 덧셈연산을 수행한다.
		//그러므로 byte형 d변수에 저장하기 위해서는 명시적인 캐스터 연산자를 사용해서 형변환을 해야한다.
		System.out.println("d의 값은 "+d);
		//byte d=(byte)(b+c);
		//연산자 +는 int 타입 변수가 생성되므로 결과값 d의 타입 변수 byte의 오버플로우 현상이 일어난다.
		//byte를 int로 바꿔야된다.
		//int 덧셈결과값을 byte타입변수에 형변환해서 저장하면 byte타입 범위를 벗어나 잘못된 값이 저장됨.
	}
}
