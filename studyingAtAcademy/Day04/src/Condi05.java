import java.util.Scanner;

public class Condi05 {
	public static void main(String[] args) {
		int i; //for 반복문 제어변수
		int total = 0; //누적합
		
		for(i=1;i<=5;i++) {
			total=total+i;
		}
		System.out.println("누적합 = " +total);
		System.out.println("===========>");
		
/* 문제 1.) 문자와 숫자를 입력받아 문자를 입력받은 숫자만큼 반복 출력하시오
 *	문자와 숫자 입력을 바꿔서 작성하면 반복할 문자가 출력이 안되는 디버깅 현상이 일어날 수 있다.
 *  개행문자(엔터)가 s에 저장됨
 *  Scan.nextLine()추가
 *  or Scan.nextLine()입력받고 Integer.parseInt()로 변환
 */

		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하시오");
		String s = sc.nextLine();
		System.out.print("숫자를 입력하시오");
		int num = sc.nextInt();
		for(i =1; i<=num;i++) {
		   System.out.println("입력받은 문자는 : "+s);
		}
		System.out.println("====================>");
/* 문제) 반복문 한개만 사용하여 다음과 같이 출력되게 코드를 작성하자.
 * 출력 예 1 5
 *       2 4
 *       3 3
 *       4 2
 *       5 1
 */
		int j=5;
		for(i=1;i<=5;i++) {
			System.out.println(i+" "+j--);
		}

	}

}
