class Calc13{
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y){
		return x-y;
	}
	
}
public class ConsTest13 {
	public static void main(String[] args) {
		
	double result01=10*10*Calc13.pi;
	 System.out.println("result01= "+result01);
	 int result02=Calc13.plus(10, 5);
	 System.out.println("10 + 5 ="+result02);
	 result02=Calc13.minus(10, 5);
	 System.out.println("10 - 5 ="+result02);
	}
}
