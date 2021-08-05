

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAOImp1 {
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "week";
	String pwd = "week";
	
	Connection con = null;
	PreparedStatement pt = null;
	ResultSet rs = null;
	String sql = null;
	
	public void memberShip(String name,String id,String password) {//회원가입
		try {
			if(memberIDSelect(id)) {System.out.println("이미 존재하는 아이디입니다.");return;}
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			sql = "insert into memberT values(?,?,?,sysdate)";
			pt = con.prepareStatement(sql);
			pt.setString(1, name);
			pt.setString(2,id);
			pt.setString(3, password);
			int re = pt.executeUpdate();
			if(re == 1) {
				System.out.println("회원가입 성공");
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt != null)pt.close();
				if(con != null)con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
	}//memberShip

	public boolean memberIDSelect(String id) {//아이디를 검색하여 있으면 true반환
		int re = -1;boolean lean = false;
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url,user,pwd);
			sql = "select m_id from memberT where m_id = ?";
			pt = con.prepareStatement(sql);
			pt.setString(1,id);
			re = pt.executeUpdate();
			if(re == 1) {
				lean = true;
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				//if(pt != null)pt.close();
				//if(con != null)con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return lean;
	}
	
	public boolean memberPWDSelect(String password) {//비밀번호를 검색하여 있으면 true반환
		int re = -1;boolean lean = false;
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url,user,pwd);
			sql = "select m_pwd from memberT where m_pwd = ?";
			pt = con.prepareStatement(sql);
			pt.setString(1,password);
			re = pt.executeUpdate();
			if(re == 1) {
				lean = true;
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				//if(pt != null)pt.close();
				//if(con != null)con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return lean;
	}
	
	public void login(String id,String password) {//로그인
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			if(memberIDSelect(id)) {
				if(memberPWDSelect(password)) {
					System.out.println("로그인성공");
				}else {
					System.out.println("비밀번호가 잃지하지 않습니다..");
				}
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(con != null)con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
	}
	
	public void updatePWD(String id,String orgPwd,String cngPwd) {//비번 변경
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			if(memberIDSelect(id) && memberPWDSelect(orgPwd)) {
				sql = "update memberT set m_pwd = ? where m_id = ? and m_pwd = ?";
				pt = con.prepareStatement(sql);
				pt.setString(1, cngPwd);
				pt.setString(2, id);
				pt.setString(3, orgPwd);
				int re = pt.executeUpdate();
				if(re == 1) {
					System.out.println("비밀번호 수정 성공");
				}
			}else {
				System.out.println("아이디또는 비밀번호가 일치하지 않습니다.");
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt != null) pt.close();
				if(con != null)con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
	}
	public void memberDel(String id,String password) {//계정 삭제
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			if(memberIDSelect(id) && memberPWDSelect(password)) {
				sql = "delete from memberT where m_id = ? and m_pwd = ?";
				pt = con.prepareStatement(sql);
				pt.setString(1, id);
				pt.setString(2, password);
				int re = pt.executeUpdate();
				if(re == 1) {
					System.out.println("삭제 성공");
				}
			}else {
				System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				
			}catch(Exception e) {e.printStackTrace();}
		}
	}
	
	public void memberInfor(String id,String password) { //회원 정보 출력
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pwd);
			if(memberIDSelect(id)) {
				if(memberPWDSelect(password)) {
					sql = "select * from memberT where m_id = ? and m_pwd = ?";
					pt = con.prepareStatement(sql);
					pt.setString(1, id);
					pt.setString(2,password);
					rs = pt.executeQuery();
					
					while(rs.next()) {
						System.out.printf("이름 : %s\t아이디 : %s\t비밀번호 : %s\t가입일 : %s\n",rs.getString("m_name"),rs.getString("m_id"),rs.getString("m_pwd"),rs.getString("m_date"));
					}
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				
			}catch(Exception e) {e.printStackTrace();}
		}
	}
}
