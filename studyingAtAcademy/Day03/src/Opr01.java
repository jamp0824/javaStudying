public class Opr01 {
	public static void main(String[] args) {
/*	+연산 기호 특징)
 *  1.숫자+숫자는 덧셈을 한다.
 *  2.숫자+문자는 문자를 우선해서 숫자가 문자열로 변경된다. 그러므로 문자+문자로 서로 연결한다.	
 */
		String str01 = "JDK"+ 6.0;
		String str02 = str01 + "특징"; //문자를 서로 연결
		System.out.println(str02);
		
		String str03 = "JDK" + 3 +3.0;
		System.out.println(str03);
		
		String str04 = 3+3.0+ "JDK"; //3.0+3.0-> 6.0 + "JDK"-> "6.0 + "JDK=> 6.0JDK
		System.out.println(str04);
	}
}
