import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import net.abc.dao.BoardDAOImpl;
import net.abc.vo.BoardVO;

public class OraclePro {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1522:xe";
		String user="week";
		String password="week";
		
		Connection con=null;
		CallableStatement cs = null; //저장 프로시저 실행 참조변수 
		String sql=null; //쿼리문을 저장할 변수
		BoardDAOImpl bdao=new BoardDAOImpl();
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			System.out.println("게시물 번호>> ");
			int no=Integer.parseInt(sc.nextLine());
			BoardVO dbNo=bdao.getFindNo(no);//오라클 번호검색
			if(dbNo != null) {
				sql="{call sel_board13(?,?,?,?)}"; //저장프로시저 호출 쿼리문
				cs=con.prepareCall(sql); //저장프로시저 실행 객체 cs생성
				cs.setInt(4, no);//네번째 물음표에 정수 숫자로 번호값 저장
				cs.registerOutParameter(1, java.sql.Types.VARCHAR); //출력레코드 타입지정
				cs.registerOutParameter(2, java.sql.Types.VARCHAR); //
				cs.registerOutParameter(3, java.sql.Types.VARCHAR);
				
				cs.execute(); //저장프로시저 실행
				System.out.println("no \t name \t title \t cont");
				System.out.println("================================>");
				System.out.println(no+"\t"+cs.getString(1)+"\t"+cs.getString(2)+"\t"+cs.getString(3));
				//번호 순번대로 이름,제목,내용을 문자열로 가져옴.
			}else {
				System.out.println("검색번호가 없어서 저장프로시저를 수행못합니다!");
			}
		} catch (Exception e) {e.printStackTrace();}
		finally {
		try {
			if(sc !=null)sc.close();
			if(cs !=null)cs.close();
			if(con !=null)con.close();
		}catch(Exception e) {e.printStackTrace();}
		}//finally
	}

}
