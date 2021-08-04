
public class ObjectTest06 {

	public static void main(String[] args) {
		String ssn = "010624-3******";
		char m = ssn.charAt(7); //charAt(7)은 8번째 자리 즉 주민번호 뒷자리 첫번째 단일문자를 구함.
		//이 메서드는 첫문자를 0부터 시작

		switch(m) {
		case '1': case '3' : System.out.println("남자입니다."); break;
		case '2': case '4' : System.out.println("여자입니다."); break;
		}
		String strVar1=new String("홍길동"); // new 로 새로운 문자열 객체 strVar1을 생성함.그러므로
		String strVar2="홍길동";				//strVar1과 strVar2는 번지주소가 다르다
		
		if(strVar1 == strVar2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		if(strVar1.contentEquals(strVar2)) {//문자열 내용만 비교
			System.out.println("문자열 내용이 같다.");
		}else {
			System.out.println("문자열 내용이 다르다.");
		}
	}
}
