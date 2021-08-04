
public class ObjectTest09 {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); //equals()메서드는 영문대소문자 구분하면서 비교
		//false
		
		String lowerStr1=str1.toLowerCase(); //toLowerCase()메서드는 영문소문자로 변경
		String lowerStr2=str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); //true
		
		System.out.println(str1.equalsIgnoreCase(str2)); //equalsIgnoreCase()메서드는 영먼
		//대소문자를 무시하ㅏ고 비교=> true
		
		String tel1=" 02";
		String tel2="1234 ";
		String tel3=" 5678 ";
		String tel=tel1.trim()+tel2.trim()+tel3.trim(); //trim()메서드는 양쪽 공백을 제거한다.
		//중간공백은 제거 못함.
		System.out.println(tel);
		
		String text="홍길동&이수홍,박연수,김자바-최명호";
		String[] names=text.split("&|,|-"); //정규표현식 ,- 기호로 연결된 정규표현식 인자값을 구분자로 
		//해서 부분 문자열을 분리한 다음 분리된 문자열을 배열로 반환한다.
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}System.out.println("=========>");
		for(String name: names) {
			System.out.println(name);
		}
	}

}
