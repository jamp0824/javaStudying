
public class Data05 {
	public static void main(String[] args) {
/*printf()메서드의 다양한 출력형태)
 * %d: 십진수 정수, %s:문자열, %c:단일문자, %b: boolean, %o:8진수 정수, 
 * %x,%X:16진수 정수, %f:10진수 실수, %e,%E: 지수형태
 *  
 */
		char x;
		x='A';
		System.out.printf("%c -> %d \n",x,(int)x);
		
		x='a';
		System.out.printf("%c -> %d \n",x,(int)x);
		//%n 줄바꿈
		
		x='0';
		System.out.printf("%c -> %d \n",x,(int)x);
	}
}
