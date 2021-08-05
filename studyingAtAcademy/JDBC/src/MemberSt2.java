import java.util.Scanner;



public class MemberSt2 {
	public static void main(String[] args) {
//		
//   * 문제) 1. com.naver.dao 패키지를 만들고 MemberDAOImp1.java 파일을 만들어 여기에 jdbc 코드를 한다. 
//    * 2. com.naver.vo 패키즈에 중간 데이터 저장 빈 클래스 MemeberVO.JAVA 를 만든다.
//    *  3. 다음과 같은 gbl_member 방명록 테이블을 만든다. 
//    *  컬럼명 자료형 크기 제약조건 
//    *  g_name varchar2 50 not null 
//    *  g_id number 38 primary key
//    *  g_pwd varchar2 50 not null
//    *  g_date date
//      
//  DAO에서 회원가입,로그인,비번변경,개인회원정보,계정삭제를 만들고 
//  default패키지에서 Member 메인클래스를 생성하여 1~5 회원가입,로그인,비번변경,개인회원정보 계정삭제 , 0 종료 의 while문을 만든다
//  단 로그인 비번변경 개인회원정보 계정삭제 는 아이디와 비밀번호가 같아야하고, 회원가입은 아이디가 같은 아이디가 존재해서는 안된다  
//    
   

/*	문제겸 주말 과제물)
 *  1.GuestDAOImpl(2).java소스를 기준으로 방명록 수정을 만든다. 수정하기전 먼저 오라클 디비로 부터 방명록 
 *  번호를 검색하는 메서드부터 먼저 만들어서 번호값이 있는 경우만 수정하고, 해당 번호가 오라클 디비로 부터 검색되지 않을때는
 *  유효성검증 경고 메시지를 출력하게 GuestEdit.java소스를 코드 완성한다.
 */		
		Scanner sc = new Scanner(System.in);
		MemberDAOImp1 md = new MemberDAOImp1();
		while(true) {
			System.out.print("0.종료\t1.회원가입\t2.로그인\t3.비밀번호 변경\t4.개인 정보 출력\t5.계정 삭제\n선택 >> ");
			int num=sc.nextInt();
			if(num==0) {
				break;
			}else if(num==1) {
				System.out.println("이름을 입력하시요");
				String name=sc.nextLine();
				System.out.println("아이디를 입력하시오");
				String id=sc.nextLine();
				System.out.println("비번을 입력하시요");
				String password=sc.nextLine();
				
				
				
			}
		}//while
	}
}
