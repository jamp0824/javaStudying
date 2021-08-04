class Member15{
	private String id;
	private String pwd;
	
	Member15(String new_id, String new_pwd){
		id=new_id; pwd=new_pwd; 
		
	} //생성자가 오버로딩이 되면 자바 컴파일러는 기본생성자를 묵시적 제공하지 않는다.
	
	void p() {}
}
public class ObjectTest15 {
	public static void main(String[] args) {
		
		//new Member15();  //묵시적으로 제공하지 않는 기본생성자를 호출하려다가 에러가 발생
	}

}
