import java.util.Scanner;

public class Opr13 {
	public static void main(String[] args) {
/* swich(정수식){
 * case 값1 : 정수식과 값1이 일치하면 실행; break;
 * case 값2 : 정수식과 값2가 일치하면 실행; break;
 * ..중략..
 * default : 해당사항 없을때 실행;
 * } 
 * break문을 만나면 switch case 다중 선택문을 종료.
 */
		Scanner scan = new Scanner(System.in);
		System.out.print("1~9사이 정수만 입력>>");
		int num = Integer.parseInt(scan.nextLine());
		
		if(!(1<=num&& num<=9)) {
			System.out.println("1~9사이 정수만 입력하세요!");
		}else {
			switch(num) {
			case 9: System.out.println("최고 관리자");
			case 8: System.out.println("두번째 관리자");
			case 7: System.out.println("세번째 관리자");
			case 6: System.out.println("네번째 관리자");
			default : System.out.println("일반 사원");
			}//switch case문에서 break문이 없는 경우는 주로 관리자 권한 설정할때 사용한다.
		}
	}
}
