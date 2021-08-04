class Member{
	String id; //회원아이디 
	
	Member(String id){
		this.id=id;
	}
	//이클립스 메뉴로 equals()메서드를 오버라이딩을 한다.
	@Override
	public boolean equals(Object obj) {//Object obj로 업캐스팅되면서 다형성 문법이 적용됨.
		if(obj instanceof Member) {
			Member member =(Member)obj; //명시적인 강제 다운캐스팅
			if(id.equals(member.id)) {//id 내용물만 비교
				return true; //같으면 true를 반환
			}
		}
		return super.equals(obj);//id가 다르면 false 반환
		//이클립스 메뉴로 equals()메서드를 오버라이딩을 한다.
	}
	
}
public class ObjectTest04 {
	public static void main(String[] args) {
		Member m01= new Member("aaaa");
		Member m02 = new Member("aaaa");
		Member m03 = new Member("bbbb");
		
		if(m01.equals(m02)) {
			System.out.println("id가 같습니다");
		}else {
			System.out.println("id가 다릅니다.");
		}
		if(m01.equals(m03)) {
			System.out.println("id가 같습니다");
		}else {
			System.out.println("id가 다릅니다.");
		}
	}

}
