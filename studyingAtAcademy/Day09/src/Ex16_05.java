class HandPhone{
	protected String model;
	protected String number;

	HandPhone(){}
	public HandPhone(String model, String number) {
		this.model=model; this.number=number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}//HandPhone
class DicaPhone extends HandPhone{
	protected String pixel;
	
	public DicaPhone(String model,String number,String pixel) {
	super(model,number);
	this.pixel=pixel;	
	}
	
	void prnDicaPhone() {
		System.out.println("모델명: "+this.model+" 번호:"+this.number+" 화소수: "+pixel);
	}
}
public class Ex16_05 {
	public static void main(String[] args) {
		DicaPhone dp=new DicaPhone("거원","010","512");
		dp.prnDicaPhone();
	}

}
