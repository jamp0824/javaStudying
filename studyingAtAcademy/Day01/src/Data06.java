import java.util.Scanner;
//import 예약어로 java.util 패키지의 스캐너클래스를 읽어들임.
public class Data06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
/*	1.	이클립스 개발툴에서 외부 패키지 폴더의 스캐너 클래스를 읽어들이는 단축키는 ctrl+shift+영문 알파벳 o
 *  2.	Scanner클래스는 자바 1.5버젼에서 추가되었고, 입력한 데이터를 읽어들일 때 사용한다. System.in은 키보드
 *  입력장치와 연결됨. new연산 키워드로 새로운 객체명 scan을 생성
 */
		System.out.print("이름 입력>> ");
		String name=scan.nextLine();	//문자열로 읽어들임.
		System.out.print("나이 입력>>");
		int age=scan.nextInt();			//정수 숫자로 읽어들임.
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		
	}
}
