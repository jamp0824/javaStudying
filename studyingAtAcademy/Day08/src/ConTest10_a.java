class St03{
	private static int a=10;
	//static 으로 정의된 정적변수 a
	private int b=20; //인스턴스 변수


	public static void setA(int new_a) {
		a=new_a;
		//static키워드로 정의된 setB()를 정적메서드라고 한다. 정적메서드는 해당클래스명으로 직접접근 할 수 있다.
		//그래서 클래스 메서드라고도 한다.
	}
	public static int getA() {
		return a;
	}
	
}

class ConsTest10_a {
	public static void main(String[] args) {

		St03 s =new St03();
		s.setA(100);
		System.out.println("s.getA()="+s.getA());
		St03.setA(1000);
		System.out.println("St03.getA()="+St03.getA()); //1000
	}

}
