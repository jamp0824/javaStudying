public class ObjectTest07 {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍"); //해당문자에서 프가 나오는 위치번호값을 구함=> 첫문자를 0부터 시작
		//indexOf()메서드는 주어진 문자열이 포함되지 않으면 -1을 반환
		System.out.println(location);
		
		if(subject.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련없는 책이군요.");
		}
		String ssn="1234567123456"; //주민번호저장
		int length = ssn.length(); //length()메서드는 문자열 길이를 반환한다. 첫문자를 1부터 시작
		if(length==13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
}
