package net.abc.vo;

public class BoardVO {

	private int b_no;
	private String b_name;
	private String b_title;
	private String b_cont;
	private String b_date;
	
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
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
		this.b_date = b_date.substring(0,10);
	}
	
	
	
	
	
	
}
