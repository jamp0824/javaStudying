import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BoardDEL {
	public static void main(String[] args) {
		
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1522:xe";
		String user="week";
		String password="week";
		
		Connection con=null;
		PreparedStatement pt=null; //쿼리문을 미리 컴파일하고, 속도가 빠름=>많이 사용함
		//쿼리문 수행 pt
		ResultSet rs=null;
		String sql= null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			System.out.println("게시물 번호 >>");
			int no = Integer.parseInt(sc.nextLine());
			sql="select b_no from boardT where b_no=?"; //?는 임의의 모르는 값
			pt=con.prepareStatement(sql); //쿼리문을 미리 컴파일
			pt.setInt(1,no); //쿼리문 첫번째 물음표에 정수 숫자로 번호값 저장
			rs=pt.executeQuery();
			if(rs.next()) {
				sql="delete from boardT where b_no=?"; //번호를 기준으로 해당 레코드 삭제
				pt=con.prepareStatement(sql); //쿼리문을 미리 컴파일 하여 수행객체 pt 생성
				pt.setInt(1, no);
				int re=pt.executeUpdate(); //삭제 성공한 레코드 행의 개수 반환
				if(re==1) {
					System.out.println("삭제 성공!");
				}
			}else {
				System.out.println("검색된 번호값이 없어서 삭제 못합니다.");
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!= null) rs.close();
				if(pt!= null) pt.close();
				if(con!= null)con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//finally
	}
}
