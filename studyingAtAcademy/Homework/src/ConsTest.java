class ConsTest{
	private int a;
	//문제해결 1. 
	ConsTest(int a){
		this.a=a;
	}
	void ConsTest(int a) {
	System.out.println("a="+a);
	}
/*생성자가 오버로딩이 되면 생성자가 묵시적 제공이 되지 않는다.
 *
 */
}//CosTest class

class Ex1_02{
	public static void main(String[] args){
		
		
		ConsTest cons1 = new ConsTest(1);
		
		//문제해결 2. new ConsTest(1) 매개변수 값 1(int)를 넣어준다
	}
}