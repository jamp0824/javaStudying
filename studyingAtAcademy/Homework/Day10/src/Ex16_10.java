class A2{
	public String toString() {
		return "4"; 
	}
}
class B2 extends A2{

	@Override
	public String toString() {
		return super.toString()+"3";	//"43"
	}
	//각자 이클립스 메뉴로 toString()메서드를 오버라이딩 하세요.
}
public class Ex16_10 {
	public static void main(String[] args) {
		System.out.println(new B2()); //.toString()이 생략됨
	}

}
