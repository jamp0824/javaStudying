
class SubClass extends Object { 
	int i=3;

	void p() {
		System.out.println("i = "+i);
	}

}  
public class Ex17_01{ 
	public static void main(String args[]) { 
		Object o = new SubClass(); //업캐스팅
		if(o instanceof SubClass) {//다운캐스팅이 가능하면 참
			SubClass  foo = (SubClass)o; 
			foo.p();

		}
	} 
}
