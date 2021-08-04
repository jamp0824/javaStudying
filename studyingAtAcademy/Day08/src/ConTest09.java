class St{
	static int a=10; //static 키워드로 정의된 변수 a를 정적변수라 한다. 정적변수는 클래스명으로 직접접근
					//할 수있다. 그래서 클래스 변수라고도 한다. 
	int b=20; //인스턴스 변수 b는 생성된 객체마다 따로 관리한다. 즉 주소값이 다르다.
/* 클래스 소속 멤버 변수 종료
 * 1. 정적(클래스)변수
 * 2.인스턴스 변수
 */
}
public class ConTest09 {

	public static void main(String[] args) {
		System.out.println("St.a= "+St.a); 	//10
		
		St s01= new St(); St s02=new St();
		
		System.out.println("s01.a= "+s01.a+",s02.a= "+s02.a);
		System.out.println("s01.b= "+s01.b+",s02.b= "+s02.b);
		//s01.b와 s02.b 메모리 주소는 다르다.
		s01.a=100; //정적변수 a는 생성된 각 객체에 의해서 값을 공유한다.
		System.out.println("s01.a="+s01.a+",s02.a= "+s02.a);
		s01.b=200;
		System.out.println("s01.b= "+s01.b+",s02.b= "+s02.b);
	}

}
