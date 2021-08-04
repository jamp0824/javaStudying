package com.naver.model2;

import com.naver.model.DataAccessObject;

public class OracleDAO implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클 DB에서 자료 검색한다.");
	}

	@Override
	public void insert() {
		System.out.println("오라클 DB에서 자료 저장한다.");
	}

	@Override
	public void update() {
		System.out.println("오라클 DB에서 자료 수정한다.");
	}

	@Override
	public void delete() {
		System.out.println("오라클 DB에서 자료 삭제한다.");
	}

}
