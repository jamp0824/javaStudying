class SmartPhone{
	private String company; 
	private String os;
	
	SmartPhone(String company, String os){
		this.company=company;
		this.os=os;
	}

	@Override
	public String toString() {
		return "모바일 os제조사:"+company+", 모바일 os(운영체제):"+os;
	}
	
	
}
public class ObjectTest05 {

	public static void main(String[] args) {

			SmartPhone myPhone = new SmartPhone("구글","안드로이드");
			
			String str = myPhone.toString();
			System.out.println(str);
			System.out.println(myPhone); 	//.toString()이 생략됨	
	}

}
