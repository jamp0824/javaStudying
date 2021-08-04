
public class Service {

	@PrintAnnotation //엘리먼트 기본값으로 설정 => value 값은 "-", 반복회수 number 15
	public void method1() {
		System.out.print("실행 내용1");
	}
	
	@PrintAnnotation("*") //기본 엘리먼트 value값을 "*"로 설정
	public void method2() {
		System.out.print("실행 내용2");
	}
	
	@PrintAnnotation(value="#", number=20) //value값을 "#", number 반복횟수를 20
	public void method3() {
		System.out.print("실행 내용3");
	}
}
