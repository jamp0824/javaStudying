class Person{
	final String NARA ="Korea"; //final로 선언된 변수는 수정할 수 없는 변수 즉 상수가 된다.상수는 선언과
	//동시에 초기화를 해야하고 관례적으로 영문대문자로 한다.
	final String JUMIN;
	String name;
	
	Person(String jumin,String name){
		this.JUMIN=jumin;
		this.name=name;		
	} //생성자 오버로딩 되면 기본생성자를 묵시적 제공하지 않는다;
	
	void print() {
		System.out.println("국가명:"+NARA);
		System.out.println("주민번호:"+JUMIN);
		System.out.println("사람이름:"+this.name);
		
	}
}
class Earth{
	static final double RADIUS=6400; //static final 정적상수 -해당 클래스명으로 직접 접근할 수 있고 수정할 수 없는 변수
}
public class FinalTest01 {
	public static void main(String[] args) {

		Person p = new Person("123456-234567","이순신");
		p.print();
		System.out.println(Earth.RADIUS); 
		//p.NARA="미국"; //상수는 수정할 수 없다.
		
		
		
	}

}
