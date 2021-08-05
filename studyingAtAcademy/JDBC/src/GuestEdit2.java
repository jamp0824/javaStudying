import java.util.Scanner;

import com.naver.dao2.GuestDAOImpl2;
import com.naver.vo2.GuestVO2;

public class GuestEdit2 {
	public static void main(String[] args) {
/*	문제겸 주말 과제물)
 *  1.GuestDAOImpl(2).java소스를 기준으로 방명록 수정을 만든다. 수정하기전 먼저 오라클 디비로 부터 방명록 
 *  번호를 검색하는 메서드부터 먼저 만들어서 번호값이 있는 경우만 수정하고, 해당 번호가 오라클 디비로 부터 검색되지 않을때는
 *  유효성검증 경고 메시지를 출력하게 GuestEdit.java소스를 코드 완성한다.
 *  
 *  2. 이것이 자바다. 1권 파트 책의 chapter 1,2,3,4,5 복습하시길 바랍니다. (먼저 문제 푸시고
 *     시간이 남게 되실때 주말까지 복습 공부하시면 됩니다.)=>6월 1일 오후 수업시간에 임의적으로 모의 기술 면접
 *     테스트 질문합니다.
 */
		Scanner sc = new Scanner(System.in);
		GuestDAOImpl2 gdao = new GuestDAOImpl2();
		System.out.println("방명록 번호 입력>> ");
		int no=Integer.parseInt(sc.nextLine());
		GuestVO2 dbNo=gdao.findNo2(no);
		if(dbNo==null) {
			System.out.println("번호값이 없어서 수정 못합니다.");
		}else {
			System.out.println("수정이름>>");
			String name=sc.nextLine();
			System.out.println("수정제목>>");
			String title=sc.nextLine();
			System.out.println("수정내용>> ");
			String cont=sc.nextLine();
			
			GuestVO2 g=new GuestVO2();
			g.setG_name(name); g.setG_title(title);
			g.setG_cont(cont); g.setG_no(no);
			int re=gdao.editGu(g); //방명록 수정
			if(re==1) {
				System.out.println("방명록 수정 성공!");
			}
		}
	}
}
