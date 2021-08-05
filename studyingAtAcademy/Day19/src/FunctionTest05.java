interface MyFunctionalInterface5{
	public abstract void method();
}
class UsingLocalVariable{
	void method(int arg) { //arg는 final상수이다. 자바 8부터는 final을 생략가능하다.
		int localVar=40; //localVar도 final 상수이다.
		
		//arg=31; //final 상수이기 때문에 수정불가
		//localVar=41; //final 상수이기 때문에 수정불가 
		
		//람다식
		MyFunctionalInterface5 fi = () ->{
			System.out.println("arg="+arg);
			System.out.println("localVar = "+localVar);
		};
		fi.method();
	}
}
public class FunctionTest05 {
	public static void main(String[] args) {
		UsingLocalVariable uv=new UsingLocalVariable();
		uv.method(20);
		
	}
}
