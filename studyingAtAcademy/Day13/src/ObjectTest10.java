import java.util.StringTokenizer;

public class ObjectTest10 {

	public static void main(String[] args) {
		String text="홍길동/이수홍/박연수";
		
		//'/' 구분자를 기준으로 문자열을 파싱 즉 분리한다. 분리된 문자열을 토큰 문자열이라고 한다.  => 회원정보
		// 수정창에서 많이 활용됨.
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens=st.countTokens(); //countTokens() 메서드는 꺼내지 않고 남아 있는 토큰문자열개수
		for(int i=0;i<countTokens;i++) {
			String token=st.nextToken(); //nextToken()메서드는 토큰 문자열을 하나씩 거내옴
			System.out.println(token);
		}
		System.out.println();
		st=new StringTokenizer(text,"/"); //토큰문자열 생성
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
