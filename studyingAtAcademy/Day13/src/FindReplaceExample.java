public class FindReplaceExample {
	public static void main(String[] args) {
		
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index=str.indexOf("자바"); //str 문자열에서 '자' 문자의 위치번호값을 반환.첫문자는 0부터
		//시작. 해당 문자를 찾지 못하면 -1
		
		if(index == -1) {
			System.out.println("자바 문자열이 포함되어있지 않습니다.");
		}else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str=str.replace("자바", "Java"); //자바 문자를 Java로 변경
			System.out.println("변경된 문자 => "+str);
		}
	}

}
