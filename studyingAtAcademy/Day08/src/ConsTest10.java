class St02{
	private static int a=10;
	//static 으로 정의된 정적변수 a
	private int b=20; //인스턴스 변수

	public void setA(int a) {
		System.out.println(this.a);
		this.a=a;
		System.out.println(this.a);
		//this.a=a;
	}
		public static void setB(int a) {
			a=a;
		//static키워드로 정의된 setB()를 정적메서드라고 한다. 정적메서드는 해당클래스명으로 직접접근 할 수 있다.
		//그래서 클래스 메서드라고도 한다.
		}
		public static int getB() {
			return a;
		}
		}
	
	class ConsTest10 {
		public static void main(String[] args) {

			St02 s =new St02();
			s.setB(100);
			St02.setB(1000);
			System.out.println("St02.getB()="+St02.getB()); //1000
		}

	}
