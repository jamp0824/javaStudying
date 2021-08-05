import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BoardList {
	public static void main(String[] args) {

		String driver="oracle.jdbc.driver.OracleDriver";//oracle.jdbc.driver는 패키지명
		//OracleDriver는 오라클 jdbc 드라이버 클래스명
		String url="jdbc:oracle:thin:@localhost:1522:xe";//오라클 접속주소,localhost는 모든
		//내 자신 컴퓨터를 가리킨다.(127.0.0.1), 1521은 오라클 연결 네트워크 포트번호,xe는 데이터베이스
		//명(디비명)
		String user="week";//오라클 접속 사용자
		String pwd="week";//사용자 비번
		
		Connection con=null;//오라클 연결 참조변수
		Statement st=null;//쿼리문 수행 참조변수
		ResultSet rs=null;//검색 결과 레코드를 저장할 참조변수
		String sql=null;//쿼리문을 저장할 변수
		
		try {
/*주말과제물) 게시물 목록 소스를 작성하여 다음과 같은 출력결과물이 나오게 한다.
 * 			번호      제목    작성자     내용      등록날짜(년월일만 나오게 한다.)
 *           7    제목01 이순신   내용01  2020-05-22
 *           ..중략
 */
			Class.forName(driver);//jdbc드라이버 클래스 로드
			con=DriverManager.getConnection(url, user, pwd);
			st=con.createStatement();
			sql="select * from boardT order by b_no desc";//번호를 기준으로 내림차순 정렬하면
			//큰숫자 번호값이 먼저 정렬
			rs=st.executeQuery(sql);//검색 결과 레코드를 rs에 저장
			System.out.println("no \t title \t name \t cont \t date");
			System.out.println("=======================================>");
			while(rs.next()) {//next()는 검색된 다음 레코드 행이 있다면 true
System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"
		+rs.getString(4)+"\t"+rs.getString(5).substring(0,10));
//1,2,3,4,5는 select문뒤에 검색되는 컬럼 순번을 뜻함.substring(0,10)은 1이상 10미만 사이의 년월일만반환
//첫문자 0부터 시작.
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
          	try {          		
          		if(rs != null) rs.close();
          		if(st != null) st.close();
          		if(con != null) con.close();
          	}catch(Exception e) {e.printStackTrace();}
		}//finally
	}
}
