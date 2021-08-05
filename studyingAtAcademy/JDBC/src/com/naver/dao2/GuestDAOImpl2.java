package com.naver.dao2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.naver.vo2.GuestVO2;

public class GuestDAOImpl2 {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@127.0.0.1:1522:xe"; //오라클 접속주소, 1522은 포트번호,
	//xe는 데이터베이스명
	String user ="week"; //오라클 접속 사용자
	String password = "week"; //사용자 비번

	Connection con= null;
	PreparedStatement pt=null; //쿼리문 수행 참조변수
	ResultSet rs = null; //검색 결과 자료를 저장할 참조변수
	String sql= null;


	//방명록 저장 
	public int insertGu(GuestVO2 g) {
		int re=1; //저장 실패시 반환값
		try {
			Class.forName(driver);
			sql="insert into tbl_guest2 values(g_no_seq2.nextval,?,?,?,?,sysdate)"; 
			con=DriverManager.getConnection(url,user,password); //쿼리문을 미리 컴파일 하여 쿼리문 수행객체 pt생성, 속도가 빠르다
			pt=con.prepareStatement(sql);
			pt.setString(1, g.getG_name()); //쿼리문 첫번째 물음표에 문자열로 작성자 저장
			pt.setString(2, g.getG_title());
			pt.setString(3, g.getG_pwd());
			pt.setString(4, g.getG_cont());

			re=pt.executeUpdate(); //저장 쿼리문 수행후 성공한 레코드행의 개수를 반환.
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs !=null) rs.close();
				if(pt !=null)pt.close();
				if(con !=null)con.close();
			}catch(Exception e) {e.printStackTrace();}
		}

		return re;
	}//insertGu	
	//방명록 목록
	public List<GuestVO2> getGuList(){
		List<GuestVO2> glist =new ArrayList<>();
		try {
			con=DriverManager.getConnection(url,user,password);
			sql="select * from tbl_guest2 order by g_no desc";
			pt=con.prepareStatement(sql);
			rs=pt.executeQuery(); //검색 결과 레코드를 rs에 저장
			while(rs.next()) {//next()는 검색된 다음 레코드행이 존재하면 참
				GuestVO2 g=new GuestVO2();
				g.setG_no(rs.getInt("g_no")); //g_no 컬럼에 저장된 레코드값을 정수 숫자로 가져옴
				g.setG_name(rs.getString("g_name"));
				g.setG_title(rs.getString("g_title"));
				g.setG_cont(rs.getString("g_cont"));
				g.setG_date(rs.getString("g_date"));

				glist.add(g); //컬렉션에 추가
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null)rs.close();
				if(pt !=null)pt.close();
				if(con !=null)con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//finally
		return glist;

	}
	//번호찾기
	public GuestVO2 findNo2(int no) {
		GuestVO2 dbNo=null;
		try {
			con=DriverManager.getConnection(url,user,password);
			sql="select g_no from tbl_guest2 where g_no=?";
			pt=con.prepareStatement(sql);
			pt.setInt(1, no);
			rs=pt.executeQuery();
			if(rs.next()) {
				dbNo=new GuestVO2();
				dbNo.setG_no(rs.getInt(1));
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null)rs.close();
				if(pt!=null)pt.close();
				if(con!=null)con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return dbNo;
	}

	//방명록 수정
	public int editGu(GuestVO2 g) {
		int re=-1; //수정 실패시 반환값
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			sql="update tbl_guest2 set g_name=?,g_title=?,g_cont=? where g_no?";
			pt=con.prepareStatement(sql);
			pt.setString(1, g.getG_name());
			pt.setString(2, g.getG_title());
			pt.setString(3, g.getG_cont());
			pt.setInt(4, g.getG_no());
			re=pt.executeUpdate(); //수정 쿼리문 성공후 성공한 레코드 행의 개수 반환. 1
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt!=null)pt.close();
				if(con!=null)con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return re;
	}//editGu()
}
