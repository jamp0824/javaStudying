import java.util.Scanner;

public class Opr16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 월을 입력>> ");
		int month = sc.nextInt();
		
		if(!(1<=month && month <= 12)) {
			System.out.println("1월 부터 12월 사이만 입력하세요!");
		}else {
			switch(month) {
			case 3: case 4: case 5: System.out.println("봄"); break;
			case 6: case 7: case 8: System.out.println("여름"); break;
			case 9: case 10: case 11: System.out.println("가을"); break;
			default: System.out.println("겨울"); break;
			
/*	문제) 위의 switch case문을 if else if 다중 조건선택문을 변경하는 코드를 작성한다.
 * 
 */
			}
		System.out.print("현재 월을 입력>> ");
		
		
		if(!(1<=month && month <= 12)) {
			System.out.println("1월 부터 12월 사이만 입력하세요!");
		}else {
			if(month>=3 && month<=5) {
				 System.out.println("봄");
			}else if(month>=6 && month<=8) {
				System.out.println("여름");
			}else if(month>=9 && month<=11) {
				System.out.println("가을");
			}else {
				System.out.println("겨울");
			}
		}
		System.out.print("현재 월을 입력>> ");
		if(month ==3 || month ==4 || month ==5) {
			System.out.println("봄");
		}else if(month ==6 || month ==7 || month ==8) {
			System.out.println("여름");
		}else if(month ==9 || month ==10 || month ==11) {
			System.out.println("가을");
		}else {System.out.println("겨울");
		}
		}
	}
}
