public class ObjectTest11 {
	public static void main(String[] args) {
		StringBuffer str01=new StringBuffer();
		//문자열 변경 작업이 많을 경우는 StringBuffer를 사용한다.
		
		str01.append("Java"); //현재 문자열 끝에 첨부
		System.out.println("str01의 값: "+str01.toString());
		str01.append(" Programming"); //기존 문자열 끝에 추가
		System.out.println("추가된 str01 : "+str01.toString());
		
		str01.replace(0, 4, "MFC"); //0이상 4미만 사이의 Java를 MFC로 변경
		System.out.println("변경된 str01 : "+str01);
		
		String str02=str01.substring(3); //3이후 부터 마지막 문자까지 반환. 첫문자를 0부터 시작
		System.out.println(str02);
		
		str01.deleteCharAt(0); //첫문자를 삭제
		System.out.println(str01);
	}

}
