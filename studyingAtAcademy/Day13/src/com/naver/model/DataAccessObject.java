package com.naver.model;

public interface DataAccessObject {

	public void select(); //public abstract이 생략된 추상 메서드
	public void insert();//자료 저장
	public void update();//자료 수정
	public void delete();//자료 삭제
		
		
		
}
