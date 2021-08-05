import com.abc.model.MemberVO;

public class FinalTest02 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO();
		
		m.setId("aaaaa"); m.setName("이순신");
		m.setPhone("010-999-9999"); m.setEmail("sin@naver.com");
		
		System.out.println("당신의 아이디: "+m.getId());
		System.out.println("이름: "+m.getName());
		System.out.println("폰번호: "+m.getPhone());
		System.out.println("이메일: "+m.getEmail());
	}

}
