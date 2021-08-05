import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.abc.vo.BoardVO;
public class BoardDAOImpl {
	String driver="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1522:xe";
	String user="week";
	String password="week";

	Connection con=null;
	Statement st=null;
	PreparedStatement pt=null;
	ResultSet rs=null;
	String sql=null;
	//게시판 저장
	public void insertBoard(BoardVO b) {
		try {
			Class.forName(driver); 
			con=DriverManager.getConnection(url,user,password);
			sql="insert into guestbook values(b_no_seq.nextval,?,?,?,sysdate)";
			pt=con.prepareStatement(sql);
			pt.setString(1, b.getB_name());
			pt.setString(2, b.getB_title());
			pt.setString(3, b.getB_cont());
			int re = pt.executeUpdate();
			if(re == 1) {
				System.out.println("성공");
			}

		}catch(Exception e){e.printStackTrace();}
		finally {
			try {
				if(pt!=null)pt.close();
				if(con!=null)pt.close();
			}catch(Exception e) {e.printStackTrace();}
		}

	}//insertBoarad
	
	public List<BoardVO> getBoardList(){
		List<BoardVO> blist = new ArrayList<>();
		try {
			con=DriverManager.getConnection(url,user,password);
			sql="select * from guestbook";
			pt=con.prepareStatement(sql);
			rs=pt.executeQuery();
			//System.out.println("번호 이름 제목 내용 날짜");
			while(rs.next()) {
				int no=rs.getInt("g_no");
				String name=rs.getString("g_name");
				String title=rs.getString("g_title");
				String cont=rs.getString("g_cont");
				String date=rs.getString("g_date");
				System.out.printf("%d %s %s %s %s\n",no,name,title,cont,date);
			}//while
		}catch(Exception e) {e.printStackTrace();}
		return blist;
	}
}