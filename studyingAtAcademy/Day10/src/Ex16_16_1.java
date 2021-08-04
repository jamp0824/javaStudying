class HandPhone{
	protected String model; //폰모델명
	protected String number; //폰번호
	
	public HandPhone() {}
	public HandPhone(String model, String number) {
		this.model=model;
		this.number=number;
	} //클래스 접근제어자가 protected이기 때문에 getter setter가 필요가 없다
}//HandPhone class

class DicaPhone extends HandPhone{
	protected String pixel; //화소수
	
	public DicaPhone(){}
	public DicaPhone(String model,String number,String pixel) {
		super(model,number);
		this.pixel=pixel;
	}
	public void prnDicaPhone() {
		System.out.println("모델명 :"+model+"\t폰번호: "+number+"\t카메라화소: "+pixel);
	}
}//DicaPhone
public class Ex16_16_1 {
	public static void main(String[] args) {
	
		DicaPhone dicaPhone = new DicaPhone("거원","010","512");
		dicaPhone.prnDicaPhone();
}
}
