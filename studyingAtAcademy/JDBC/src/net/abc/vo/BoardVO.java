package net.abc.vo;

public class BoardVO {//데이터 저장빈 클래스
	
	private int b_no;//게시판 번호
	private String b_name;//작성자
	private String b_title;//제목
	private String b_cont;//내용
	private String b_date;
	
	//매개변수가 없는 기본생성자가 생략됨.
	/*문제)학생분 각자 스스로 setter(),getter()메서드 총 10개를 이클립스 메뉴로 생성하세요. 
	 */
	
	public int getB_no() {
		return b_no;
	}//getter()메서드=>값반환 메서드
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}//setter()메서드라고 통칭
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_cont() {
		return b_cont;
	}
	public void setB_cont(String b_cont) {
		this.b_cont = b_cont;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date.substring(0,10);//0이상 10미만 사이의 년월일만 반환
		//substring()메서드는 첫문자를 0부터 시작
	}	
}









