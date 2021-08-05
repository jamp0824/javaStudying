import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAOImp2 {

	String driver="oracle.jdbc.driver.oracleDriver";
	String url="jdbc:oracle:thin:@127.0.0.1:1522:xe";
	String user="week";
	String password="week";
	
	Connection con = null;
	PreparedStatement pt = null;
	ResultSet rs=null;
	String sql=null;
	public boolean memberIDSelect(String id) {//아이디를 검색하여 있으면 true반환
		try {
		Class.forName(driver);
		sql="select from tbl_guest2 "
		con=DriverManager.getConnection(id);
			
	}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt!=null) {pt.close();}
				if(rs!=null) {rs.close();}
				if(con!=null) {con.close();}
				
			}catch(Exception e) {e.printStackTrace();}
		}
	
	public void memberShip(MemberVO2 mvo){//회원가입
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			if(mvo.equals(id)) {
				System.out.println("중복되는 아이디입니다.");
			break;
			}
			sql="insert into tbl_guest2 values(g_no_seq2.nextval,?,?,?,?,sysdate)"; 
			pt=con.prepareStatement(sql);
			pt.setString(1, name);
			pt.setString(2, id);
			pt.setString(3, password);
			int re = pt.executeUpdate();
			if(re==1) {
				System.out.println("로그인 성공");				
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt!=null) {pt.close();}
				if(rs!=null) {rs.close();}
				if(con!=null) {con.close();}
				
			}catch(Exception e) {e.printStackTrace();}
		}
			
	}//memberShip
	
	public void login(String id,String password) {//로그인
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			if(id.equals(id)) {
				if(password.equals(password))
			}
			sql="insert into tbl_guest2 values(g_no_seq2.nextval,?,?,?,?,sysdate)"; 
			pt=con.prepareStatement(sql);
			pt.setString(1, name);
			pt.setString(2, id);
			pt.setString(3, password);
			int re = pt.executeUpdate();
			if(re==1) {
				System.out.println("로그인 성공");				
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt!=null) {pt.close();}
				if(rs!=null) {rs.close();}
				if(con!=null) {con.close();}
				
			}catch(Exception e) {e.printStackTrace();}
		}
			
	}//memberShip
	
	
	public void memberInfor() { //회원 정보 출력
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			if(id.equals(id)) {
				System.out.println("중복되는 아이디입니다.");
			break;
			}
			sql="insert into tbl_guest2 values(g_no_seq2.nextval,?,?,?,?,sysdate)"; 
			pt=con.prepareStatement(sql);
			pt.setString(1, name);
			pt.setString(2, id);
			pt.setString(3, password);
			int re = pt.executeUpdate();
			if(re==1) {
				System.out.println("로그인 성공");				
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt!=null) {pt.close();}
				if(rs!=null) {rs.close();}
				if(con!=null) {con.close();}
				
			}catch(Exception e) {e.printStackTrace();}
		}
			
	}//memberShip
}
