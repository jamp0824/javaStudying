import java.util.Scanner;

public class Opr06 {
	public static void main(String[] args) {
		
		int result =0;
		result+=10; //result = result+10;와 같다.
		System.out.println("result ="+result);	//10
		
		result-=5;
				System.out.println("result ="+result); //5
		
		result *=3 ;
		System.out.println("result ="+result); //15
		
		result/=5 ;   
		System.out.println("result ="+result);  //3
		
		result%=3;
		System.out.println("result ="+result);  //0
		System.out.println("=================>");
/*	문제) java.util 패키지의 스캐너 클래스를 이용해서 
 * 		0부터 100사이 임의의 정수 정수값을 85를 입력받는다.그런
 * 		다음 3항 조건연산자를 사용해서 정수가 90점 이상이면 'A'학점, 80점이상이면 'B'학점, 80점
 * 		미만이면 'C'학점을 출력하게 한다.
 */		
		System.out.print("0~100 사이의 점수를 입력하시오(예 85) >");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		char grade = ' '; //학점, 단일문자 초기화는 한깐 띄워서 ' '
		grade = (score>=90)?'A':((score>=80)?'B':'C');
		System.out.printf("%d점수는 %c학점입니다: ",score,grade);
		
		}
}
