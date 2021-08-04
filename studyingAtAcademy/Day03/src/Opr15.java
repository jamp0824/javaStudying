import java.util.Scanner;

public class Opr15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영문 나라이름(korea)>> ");
		String nara =sc.nextLine();
		char ch =nara.charAt(0);//charAt(0)메서드는 영문나라이름의 첫 단일문자를 구함. 첫문자를 0부터 시작
		switch(ch) {
		case 'k': case 'K': System.out.println("대한민국"); break;
		case 'j': case 'J': System.out.println("일본"); break;
		case 'a': case 'A': System.out.println("미국"); break;
		case 'c': case 'C': System.out.println("캐나다"); break;
		default: System.out.println("해당 나라 없다.");
		}
	}
}
