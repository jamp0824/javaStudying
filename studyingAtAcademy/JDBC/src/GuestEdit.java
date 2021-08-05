import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class GuestEdit {
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
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1522:xe";
		String user="week";
		String password="week";
		
		Connection con = null;
		PreparedStatement pt= null;
		ResultSet rs= null;
		String sql = null;
		
		try {
			Class.forName(driver);
			
			con=DriverManager.getConnection(url,user,password);
			Scanner sc  = new Scanner(System.in);
			System.out.print("게시물 번호>>");
			int g_no=sc.nextInt();
			sql="select g_no from tbl_guest where g_no="+g_no;
			pt=con.prepareStatement(sql);
			rs = pt.executeQuery();
			if(rs.next()) {
				System.out.print("수정할 작성자 >> ");
				String name=sc.nextLine();
				name=sc.nextLine();
				System.out.print("수정할 제목 >> ");
				String title=sc.nextLine();
				System.out.print("수정할 내용>> ");
				String cont=sc.nextLine();
				sql="update tbl_guest set g_name='"+name+"',g_title='"+title+"',g_cont='"+cont+"'where g_no="+g_no;
				int re= pt.executeUpdate(sql);
				if(re==1) {
					System.out.println("수정성공!");
				}//if
			}else {
				System.out.println("검색된 번호가 없어서 수정못합니다.");
			}//else
		} catch (Exception e) {e.printStackTrace();	}
		finally {
			try {
				if(rs !=null) rs.close();
				if(pt !=null) pt.close();
				if(con !=null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//final
	}
}
