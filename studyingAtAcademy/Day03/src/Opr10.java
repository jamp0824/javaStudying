import java.util.Scanner;

public class Opr10 {
	public static void main(String[] args) {
/* 문제)스캐너를 이용해서 정수 숫자를 입력받아서 입력받은 값이 0인지 아닌지를 판별하는 코드를 작성하자.
 * if ~else 문을 사용한다.
 */
	System.out.print("정수 숫자를 입력하시오 : ");
	Scanner sc = new Scanner(System.in);
	String temp = sc.nextLine();
	int num = Integer.parseInt(temp);
	
	if(num==0) {
		System.out.println("입력받은 숫자" +num+"은 0입니다.");
	}else {
		
		System.out.println("입력받은 숫자" +num+"은 0이 아닙니다");
	}
	System.out.println("-------------------");
	System.out.print("첫번째 정수 숫자 입력>>");
	int a = Integer.parseInt(sc.nextLine());
	System.out.print("두번째 정수 숫자입력>>");
	int b = Integer.parseInt(sc.nextLine()); //입력받은 문자를 정수 숫자로 변경
	
	int max =0;
	int min =0;
	
	if(a>b) {
		max =a; min=b;
		
	}else {
		max=b; min=a;
	}//if else
	System.out.println("최대값="+max+"최소값"+min);
	}
	}


