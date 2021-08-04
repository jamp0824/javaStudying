import java.util.Scanner;

public class BreakTest06 {
	public static void main(String[] args) {
		
		int menu=0;
		int num1=0;
		int num2=0;
		Scanner sc = new Scanner(System.in);
		
		outer: //이중 반복문을 중단하기 위한 라벨명
			while(true) {
				System.out.println("1.곱셈");
				System.out.println("2.덧셈");
				System.out.println("3.뺄셈");
				System.out.print("원하는 메뉴를 1~3번에서 선택하세요.(종료시 0번) ");
				
				menu=Integer.parseInt(sc.nextLine());
				
					if(menu==0) {
						System.out.println("프로그램을 종료합니다.");
						break; //반복문 중단
					}else if(!(1 <=menu && menu<=3)) {
						System.out.println("메뉴를 잘못 선택했습니다.(종료0)");
						continue; //아래문장을 실행안함.
					}
					for(;;) {
						System.out.print("계산할 값을 입력.(계산 종료는:0,전체 종료:99)>>");
						num1=Integer.parseInt(sc.nextLine());
						if(num1==0) {
							break; //for중단
						}else if(num1==99) {
							break outer; //for while 전체종료
						}
						System.out.print("계산할 값을 입력(계산 종료는:0, 전체 종료:99)>>");
						num2=Integer.parseInt(sc.nextLine());
						if(num2==0) {
							break; //for중단
						}else if(num2==99) {
							break outer; //for while 전체종료
						}
						switch(menu) {
						case 1: System.out.print("result="+(num1*num2));
								break;
						case 2: System.out.println("result="+(num1+num2));
								break;
						case 3: System.out.println("result="+(num1-num2));
								break;
						}
					}//for반복문 무한루프(Loop:반복)
			}//무한 while반복문
	}

}
