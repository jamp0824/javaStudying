import java.util.Scanner;

import com.naver.dao2.GuestDAOImpl2;
import com.naver.vo2.GuestVO2;

public class GuestInsert2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("tbl_guest2테이블에 레코드 저장");
		System.out.print("이름 입력>>");
		String name=sc.nextLine();
		System.out.print("제목 입력>>");
		String title=sc.nextLine();
		System.out.print("비번 입력>> ");
		String pwd=sc.nextLine();
		System.out.print("내용 입력>> ");
		String cont=sc.nextLine();
		
		GuestDAOImpl2 gdao=new GuestDAOImpl2();
		GuestVO2 g=new GuestVO2();
		g.setG_name(name);
		g.setG_title(title);
		g.setG_pwd(pwd);
		g.setG_cont(cont);
		
		int re=gdao.insertGu(g);
		if(re ==1) {
			System.out.println("자료 저장성공!");
		}
	}

}
