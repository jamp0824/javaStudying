import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BoardEdit {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1522:xe";
		String user="week";
		String password="week";

		Connection con=null;
		Statement st = null;
		ResultSet rs=null;
		String sql=null;

		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			st=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.print("게시물 번호>> ");
			int b_no=Integer.parseInt(sc.nextLine()); //읽어들인 문자열 번호값을 정수숫자로 바꿈
			sql="select b_no from BoardT where b_no="+b_no; //번호를 기준으로 오라클디비로 부터
			//번호값을 검색
			rs=st.executeQuery(sql); //검색 결과 번호값을 rs에 저장
			if(rs.next()) {//레코드가 한개 검색되면 if문 사용.next()는 검색된 번호레코드가 있다면 참
				System.out.print("수정할 작성자 >> ");
				String name=sc.nextLine();
				System.out.print("수정할 제목 >> ");
				String title=sc.nextLine();
				System.out.print("수정할 내용>> ");
				String cont=sc.nextLine();
				 sql="update boardT set b_name='"+name+"',b_title='"+title+"',b_cont='"+
			    		 cont+"' where b_no="+b_no;//번호를 기준으로 작성자,제목,내용만 수정
				int re=st.executeUpdate(sql);//수정 성공한 레코드 행의 개수 반환
				
												
				
				if(re==1) {
					System.out.println("수정성공!");
				}//if
			}else {
				System.out.println("검색된 번호가 없어서 수정못합니다.");
			}//else
		}catch(Exception e) {e.printStackTrace();}
		finally{
			try {
				if(rs !=null) rs.close();
				if(st !=null) st.close();
				if(con !=null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//final
	
	}
}
