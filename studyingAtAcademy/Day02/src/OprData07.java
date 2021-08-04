
public class OprData07 {

	public static void main(String[] args) {
		
		int x= -100;
		int result01= +x; // -100
		int result02= -x; // 100
		System.out.println("result01 = "+result01);
		System.out.println("result02 - "+result02);
		
		short s =100;
		//short result03 = -s; //부호 연산자를 사용하면 결과값 타입이 int 타입이다.
		int result03 = -s;
		System.out.println("result03 : "+result03);
		
		int var01=1;
		int var02=3;
		int var03=2;
		int result= var01+ var02 * var03; //곱셈연산이 덧셈연산보다 우선한다. 1+3*2->1+6 ->7
		System.out.println("result = "+result);
		
		result=(var01+var02)*var03; //먼저 연산 수행을 하고 싶으면 ()를 사용한다. -> 
		//1+3이 먼저 연산->4*2->8
		System.out.println("result = "+result);
	}
}
