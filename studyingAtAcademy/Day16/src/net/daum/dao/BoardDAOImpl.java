package net.daum.dao;


import java.util.ArrayList;
import java.util.List;

import net.daum.vo.BoardVO;

public class BoardDAOImpl {


	public List<BoardVO> getBoardList() {
		List<BoardVO>list=new ArrayList();
		list.add(new BoardVO("제목1","내용1"));
		list.add(new BoardVO("제목2","내용2"));

		return list;
	}



}
