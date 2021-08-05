class Calculator{
	double areaCircle(double r) {
		System.out.println("Calculator클래스의 areaCirlcle() 메서드 실행");
		return 3.14159*r*r;
	}
}
class Computer extends Calculator{
	//이클립스 메뉴로 오버라이딩 하시길 바랍니다.

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI*r*r; //더 정확한 원의 면적이 반환
	}
}
public class FinalTest15 {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator =new Calculator();
		System.out.println("원의 면적: "+calculator.areaCircle(r)); //인자값 전달이 5 int->
		//5.0 double 타입으로 자동형변환
		System.out.println();//줄바꿈
		
		r=100;
		Computer computer = new Computer();
		System.out.println("원의 면적: "+computer.areaCircle(r)); //오버라이딩 된 메서드 호출
 
	}

}
