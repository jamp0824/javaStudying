class TestClass{
	private Object member;
	//직접 이클립스 메뉴로 setter(),getter()메서드를 만든다

	public Object getMember() {
		return member;
	}

	public void setMember(Object member) {
		this.member = member;
	}
	
}
public class ListMap02 {
	public static void main(String[] args) {
		TestClass tc=new TestClass();
		tc.setMember(10); //오토박싱과 업캐스팅
		System.out.println(tc.getMember());
		
		tc.setMember("abc");//업캐스팅
		Object obj=tc.getMember();
		if(obj instanceof String) {
			String temp=(String)obj; //다운캐스팅
			System.out.println(temp.toUpperCase());
		}/*	제네릭 타입을 지정하지 않아서 자바 최상클래스 타입으로 업캐스팅 형변환 되면서 저장되고, 다운캐스팅등 불필요한 연산 수행이 이루어진다.
		 	이런 문제점은 결국 해당 프로그램 속도 저하문제가 발생한다. 결국 제네릭타입이 나온 이유중에 하나가 된다.
		*/
	}

}
