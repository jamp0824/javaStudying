
public class OprData05 {

	public static void main(String[] args) {
/* +연산기호 특징)
 *  1.숫자+숫자=덧셈을 한다
 *  2.문자열+문자열을 +연산기호가 문자열을 서로 연결한다.
 *  3.숫자+문자열에서는 자바는 문자열을 우선한다. 그러므로 숫자가 문자열로 치환되어져서 문자열+문자열로 서로
 *  연결한다. 예를 들면 7+"7"="7"+"7"->"77
 *  숫자보다는 문자열을 우선하기 때문이다.
 */
		System.out.println(7+7+""); //왼쪽에서 오른쪽으로 연산순서-> 7+7->14+""=>"14"+""->"14"
		System.out.println(""+7+7); //""+7+7->""+"7"+7->""+"7"+"7"->"77"
		
		String a="Apple";
		String b="Banana";
		String result =a+b;
		System.out.println(result); //"AppleBanana"
		
		String str="결과값: "; int n=10;
		System.out.println(str+n);
		System.out.println("결과값: "+n);
	}

}
