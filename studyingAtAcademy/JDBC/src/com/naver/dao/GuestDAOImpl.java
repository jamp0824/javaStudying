package com.naver.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.naver.vo.GuestVO;

import net.abc.vo.BoardVO;

public class GuestDAOImpl {
   String driver = "oracle.jdbc.OracleDriver";
   String url = "jdbc:oracle:thin:@localhost:1522:xe";
   String user = "week";
   String psw = "week";

   Connection con = null;
   PreparedStatement pt =null;
   ResultSet rs = null;
   String sql = null;

   public void guestInsert(GuestVO gv) {
      try {
         Class.forName(driver);
         con = DriverManager.getConnection(url, user, psw);
         sql ="insert into tbl_guest values(g_no_seq.nextval,?,?,?,?,sysdate)";
         pt=con.prepareStatement(sql);
         pt.setString(1, gv.getG_name());
         pt.setString(2, gv.getG_title());
         pt.setString(3, gv.getG_pwd());
         pt.setString(4, gv.getG_cont());
         int rn = pt.executeUpdate();
         if(rn == 1) {
            System.out.println("저장 성공");
         }
      } catch (Exception e) {e.printStackTrace();} 
      finally {
         try {
            if (pt != null)   pt.close();
            if (con != null)con.close();
         } catch (Exception e) {   e.printStackTrace();}
      } // finally
   }// guestInsert
//--------------------------------------------------------------------------
   public List<GuestVO> getGuestList(){
      List<GuestVO> blist = new ArrayList<>();
      try {
         con=DriverManager.getConnection(url, user, psw);
         sql = "select * from tbl_guest order by g_no desc";
         pt = con.prepareStatement(sql);
         rs = pt.executeQuery();
         while(rs.next()) {
            GuestVO gv = new GuestVO();
            gv.setG_no(rs.getInt(1));
            gv.setG_name(rs.getString("g_name"));
            gv.setG_title(rs.getString("g_title"));
            gv.setG_pwd(rs.getString("g_pwd"));
            gv.setG_cont(rs.getString("g_cont"));
            gv.setG_date(rs.getString("g_date"));
            
            blist.add(gv);
         }//while
      }catch(Exception e) {e.printStackTrace();}
      finally {
         try {
            if(rs != null) rs.close();
            if(pt != null) pt.close();
            if(con != null) con.close();
         }catch(Exception e) {e.printStackTrace();}
      }//finally
      return blist;
   }//getGuestList
   
   
   public GuestVO getFindNo(int no) {
	   GuestVO g=null;
	   try {
		   con=DriverManager.getConnection(url,user,psw);
		   sql="select g_no from tbl_guest where g_no=?";
		   pt=con.prepareStatement(sql);
		   pt.setInt(1, no);
		   rs=pt.executeQuery();
		   if(rs.next()) {
			   g=new GuestVO();
			   g.setG_no(rs.getInt(1));  
		   }//if
		}catch(Exception e) {e.printStackTrace();}
	   finally {
		   try {
			   if(pt !=null)pt.close();
			   if(con !=null)con.close();
		   }catch(Exception e) {e.printStackTrace();}
		   }//finally
	   return g;
	   }//getFindNo()
   	//게시물 수정
   public int updateGuest(GuestVO ug) {
	   int re=-1;
	   try {
		   con=DriverManager.getConnection(url,user,psw);
		   sql="update tbl_guest set g_name=?,g_title=?,g_cont=? where g_no=?";
		   pt=con.prepareStatement(sql);
		   pt.setString(1, ug.getG_name());
		   pt.setString(2, ug.getG_title());
		   pt.setString(3, ug.getG_cont());
		   pt.setInt(4, ug.getG_no());
		   re=pt.executeUpdate();
	   }catch(Exception e) {e.printStackTrace();}
	   finally {
		   try {
			   if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		   return re;
	   }//updateGuest()
   }
   
