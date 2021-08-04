import java.util.Scanner;

public class Condi07 {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		String input;
		System.out.println("메시지 입력하세요");
		System.out.println("프로그램 종료하려면 q를 입력하세요.");
		
		do {
			System.out.print(">> ");
			input=sc.nextLine(); //문자열로 읽어들임
			System.out.println(input);
			
		}while(!input.equals("q")); //입력값이 q 일때 반복문 종료
		
		System.out.println(); //줄바꿈, 개행
		System.out.println("프로그램 종료");
		/* 문제 2) 1부터 입력받은 값까지 홀수 출력하는 프로그램을 작성하시오.
		 */
			
			System.out.print("숫자를 입력하시오 : ");
			int j=sc.nextInt();
			for(int i=1;i<=j;i+=2) {
				System.out.print(i+" ");
			}
			System.out.println("\n=============>");
			
			for(int i=1;i<=j;i++) {
				if(i%2==1) {
					System.out.print(i+" ");
				}
			}System.out.println();
			int i = 10;
			while(i>=2) {
				if(i%2==0) {
					
				System.out.print(i);
				if(i==2) {break;}
				System.out.print(",");
				}i--;
			}
				System.out.println();
				i = 10;
				while(i>=4) {
					
						
					System.out.print(i+",");
					i-=2;
				
					}System.out.print(i);
					System.out.println();
/* 문제)A~Z사이 영어 알파벳을 출력하는 프로그램을 작성하시오.(for반복문 사용)*
 */
			for(char a='A';a<='Z';a++) {
				System.out.print(a+" ");
			
		}
			}
			
	}


