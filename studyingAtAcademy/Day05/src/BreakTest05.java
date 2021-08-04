import java.util.Scanner;

public class BreakTest05 {
	public static void main(String[] args) {
		int menu=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("원하는 점심 메뉴를 (1~3) 선택하세요.(종료:0)>> ");
			System.out.println("1) 비빔냉면");
			System.out.println("2) 탕수육");
			System.out.println("3) 고등어 조림");
			System.out.print("메뉴를 선택하세요 >>");
			
			menu=Integer.parseInt(sc.nextLine()); //nextLine()메서드로 문자열로 읽어들여서 parseInt()
			//메서드로 정수 숫자로 변경
			
			if(menu==0) {
			 System.out.println("점심 메뉴 선택 종료");
			 break;
			}else if(!(1<=menu && menu<=3)) {
				System.out.println("잘못된 메뉴 선택입니다. (종료:0)");
				continue; //아래문장을 실행안함.
			}//if else if
			
			if(menu==1) {
				System.out.println("선택하신 점심 메뉴는 비빔냉면입니다.");
			}else if(menu==2) {
				System.out.println("선택하신 점심 메뉴는 탕수육입니다.");
			}else if(menu==3) {
				System.out.println("선택하신 점심 메뉴는 고등어 조림입니다.");
			}else {
				System.out.println("");
			}
			
			
		}
	}

}
