package net.daum.vo;

public class BoardVO {
	private String title; //게시판 제목
	private String content; //게시판 내용



	public BoardVO(String title,String content){
		this.title=title; 
		this.content=content;
	}
	/* 문제) 생성자 오버로딩을 통해서 각 멤버변수 초기화 코드를 완성하고 , 이클립스 메뉴로 getter()메서드만 정의한다.
	 * 
	 */
	
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
}
