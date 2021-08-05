import java.util.Scanner;

public class memberSt {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		MemberDAOImp1 md = new MemberDAOImp1();
		while(true) {
			System.out.print("0.종료\t1.회원가입\t2.로그인\t3.비밀번호 변경\t4.개인 정보 출력\t5.계정 삭제\n선택 >> ");
			int su = sc.nextInt();
			if(su>5 || su < 0) {
				System.out.println("정확한 값을 입력해주세요");
			}
			else if(su == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(su == 1) {
				System.out.print("이름 입력 >>");
				String name = sc.nextLine();
				name = sc.nextLine();
				System.out.print("아이디 입력 >> ");
				String id = sc.nextLine();
				System.out.print("비밀번호 입력 >> ");
				String password = sc.nextLine();
				md.memberShip(name, id, password);
			}
			else if(su == 2) {
				System.out.print("아이디 입력 >> ");
				String id = sc.nextLine();
				id = sc.nextLine();
				System.out.print("비밀번호 입력 >> ");
				String password = sc.nextLine();
				md.login(id, password);
			}
			else if(su == 3) {
				System.out.print("아이디 입력 >> ");
				String id = sc.nextLine();
				id = sc.nextLine();
				System.out.print("비밀번호 입력 >> ");
				String orgPwd = sc.nextLine();
				System.out.print("변경할 비밀번호 입력 >> ");
				String cngPwd = sc.nextLine();
				md.updatePWD(id, orgPwd, cngPwd);
			}
			else if(su == 4) {
				System.out.print("아이디 입력 >> ");
				String id= sc.nextLine();
				id = sc.nextLine();
				System.out.print("비밀번호 입력 >> ");
				String password = sc.nextLine();
				md.memberInfor(id, password);
			}
			else if(su == 5) {
				System.out.print("아이디 입력 >> ");
				String id = sc.nextLine();
				id = sc.nextLine();
				System.out.print("비밀번호 입력 >> ");
				String pwd = sc.nextLine();
				md.memberDel(id,pwd);
			}
		}//while
	}
}
