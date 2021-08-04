
public class OprData02 {

	public static void main(String[] args) {

		byte a =10;
		byte b =30;
		byte c =(byte)(a*b);//int*int=int->30*10=300은 byte타입 범위를 벗어나 잘못된 값이 저장됨
		System.out.println(c);
/* 문제)byte범위를 벗어나 잘못된 값 44를 출력한다. 원하는 300값이 출력되게 소수를 수정한다.
 * 
 */
		int d =a*b;
		System.out.println(d);

		int a2=1000000;
		int b2=1000000;
		long c2= a2*b2;
		System.out.println(c2);
/* 문제)c2변수값은 int타입 범위를 벗어나서 잘못된 값-727379976 음수값을 출력한다. long c3변수에 
 * a2*b2를 코드를 수정해서 정확한 곱셈결과값을 저장하고 출력하자
 * 
 */
		
		long c3=(long)a2*b2;
		//long c3=(long)(a2*b2) //이미 각 변수값들이 범위를 벗어나기 때문에 -값을 값고 있다.
		System.out.println(c3);
	}

}
