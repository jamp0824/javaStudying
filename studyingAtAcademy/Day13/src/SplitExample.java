import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {

		String tel="02-8888-9999";

		//'-'구분자를 기준으로 폰번호를 분리=> 분리된 폰번호를 토큰 문자열이라고 한다.(회원정보 수정창)
		//split
		String[] phoneArr=tel.split("-");
		for(String p:phoneArr) {
			System.out.println(p);
		}
		System.out.println();
		/*	문제) java.util패키지의 StringTokenizer 클래스를 활용하여 전화번호를 분리해서 다음과 같이 
		 * 	출력되게 한다.
		 * 	출력예)  010
		 * 		   8888
		 * 		   9999
		 */
		StringTokenizer st = new StringTokenizer(tel,"-");
		int countTokens=st.countTokens();
		for(int i =0;i<countTokens;i++) {
			System.out.println(st.nextToken());
		}//for
		System.out.println();
		st = new StringTokenizer(tel,"-"); 
		while(st.hasMoreTokens()) {	//분리된 폰번호가 있다면 참
			System.out.println(st.nextToken());	//토큰문자열을 가져와 출력
		}//while

	}

}
