import java.util.Scanner;

public class Opr08 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		
		System.out.println((x>7)&&(y<=5));	//true && true = true
		System.out.println((x%3 == 2) || (y%2 !=1));	//false || false = false
		System.out.println("================>");
		
/*	문제) 1. 짝수인지 홀수인지 판단하는 프로그램을 조건 연산자를 이용하여 작성하시오.
 *  [결과] 7은 홀수이다.
 *  	  8은 짝수이다.
 */
		String result;
		System.out.print("숫자를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		result = (num%2==1)?"은 홀수이다.":"은 짝수이다.";
		System.out.println("[결과] "+(num+result));
	}
}
