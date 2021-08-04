import java.util.Scanner;

public class Opr17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력(931025-1111111)>> ");
		String jumin = sc.nextLine();
		
		char gender = jumin.charAt(7); //charAt(7)메서드는 두번째 주민번호 첫자리 단일문자를 구함. 첫문자를 0부터 시작
		char year = jumin.charAt(0);
		switch(gender) {
		case '1': case '3' :
			System.out.println("당신은 남자입니다");
		switch(gender) {
			case '1':
				System.out.println("당신은 밀레니엄 이전에 태어났습니다");
				break;
			default :
				System.out.println("당신은 밀레니엄 이후에 태어났습니다");
				break;
			}
			break;
/* 문제) 이중 switch case 문을 활용하여 2000년 이전에 태어난 남자분과 이후에 태어난 남자분, 여자분
 * 각각 구분하는 코드를 작성하자. 
 */
		case '2': case '4' :
			System.out.println("당신은 여자입니다");
		switch(gender) {
		case '2':
			System.out.println("당신은 밀레니엄 이전에 태어났습니다");
			break;
		default :
			System.out.println("당신은 밀레니엄 이후에 태어났습니다");
			break;
		}
			
		default : 
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}
	}
}
