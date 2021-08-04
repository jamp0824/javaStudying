class MyDate12{
	private int year;//년도
	private int month;//월
	private int day;//일
	
	MyDate12(){
		System.out.println("매개변수가 없는 기본생성자 호출");
/* 생성자 특징)
 *  1.생성자 이름은 클래스명과 같다.
 *  2.생성자명 앞에 리턴타입이 없다. 
 */
	}
	void pr() {
		System.out.println(year+"/"+month+"/"+day); //0/0/0
	}
}
public class ObjectTest12 {
	public static void main(String[] args) {
		MyDate12 m=new MyDate12(); //new MyDate12();에 의해서 생성자를 호출
		m.pr();
	}

}
