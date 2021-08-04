public class StringBuilderExample {
	public static void main(String[] args) {
		String str="";
		for(int i =1; i<=10;i++) {
			str+=i; //""+숫자 가 되면 자바는 문자열을 우선해서 숫자가 문자열로 변경된다. 그러므로 ""+"1"=>"1"
					//"1"+"2"=>"12", String 클래스는 문자열 자체를 변경 수정하지 못하고 새로운 객체가 만들어지면서
					//문자열이 할당된다.=>10개의 객체가 힙영역에 생성된다. 프로그램 속도 저하문제가 발생한다.
					//좋은 코드라고 볼수 없다.+는 덧셈연산자가 아니라 문자열 연결 연산자이다.
		}
		System.out.println(str);
		
		//개선 코드 작성
		StringBuilder sb = new StringBuilder(); //StringBuilder클래스는 문자열 자체 변경수정 가능함.
		for(int i =1;i<=10;i++) {
			sb.append(i); //기존값에 추가
		}
		str=sb.toString(); //문자열로 변경
		System.out.println(str);
	}

}
