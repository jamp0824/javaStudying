class Member{
	String id="aaaa";
	String name="홍길동";
}
public class TryCatch04 {
	public static void main(String[] args) {
		Member m =null; //m참조변수에는 번지 객체주소가 저장안됨.
		try {
			System.out.println(m.id+","+m.name);
		}catch(Exception e) {
			System.out.println("예외 발생"+e);
			m=new Member();
			System.out.println("아이디:"+m.id+",이름:"+m.name);
		}
	}
}