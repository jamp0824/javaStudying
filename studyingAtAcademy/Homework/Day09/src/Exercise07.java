import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run=true;
		int balance =0;
		Scanner sc = new Scanner(System.in);

		while(run) {
			System.out.println("-----------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------");
			System.out.println("선택> ");
			int money=0;
			int pressNum=sc.nextInt();
			if(pressNum<1&&pressNum>4) {
				System.out.println("잘못된 선택입니다.");
			}else{
				switch (pressNum) {
				case 1:
					System.out.println("예금하실 금액을 기입하세요");
					money=sc.nextInt();
					balance+=money;
					break;
				case 2: 
					System.out.println("출금하실 금액을 넣으세요");
					 money=sc.nextInt();
					balance-=money;
					break;
				case 3:
					System.out.println("현재 잔고는 "+balance+"원입니다.");
					break;
				default:
					run=false; 
					break;
				}
			}
			
		}
	}
}
