import java.util.Scanner;

public class BreakTest10 {

	public static void main(String[] args) {

		boolean run=true;
		int balance=0;//잔고
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------->");
			System.out.println("1.예금| 2.출금| 3. 잔고| 4.종료");
			System.out.println("------------------>");
			
			System.out.println("메뉴 선택>> ");
			
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: 
			System.out.print("예금액>>");
			balance += sc.nextInt();
			break;
		case 2:
			System.out.print("출금액>>");
			int money=sc.nextInt();
			if(balance-money<0) {
				System.out.println("잔액이 부족합니다.");
			}else {
				balance-=money;
			}
			
			break;
		case 3:
			System.out.print("잔고>>");
			System.out.println(balance);
			break;
		case 4:
			run=false; break;
		}
		System.out.println(); //줄바꿈=개행
	  }//while
	  System.out.println("계좌프로그램 종료");
/* 1~100사이의 제일 큰 7의 배수
 * 
 */
	  int i;
	  for(i=100;i>=1;i--) {
		  if(i%7==0) {
			  break;}
	  System.out.println("1~100사이의 제일 큰 7의 배수 "+i);
	  }
	 int s=0;
	for(i=1;i<=5;++i) {
		if(i==3)continue;
		s+=i;
	}
System.out.println("sum="+s);
	}
}
