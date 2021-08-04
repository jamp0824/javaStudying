class Super { 
	public int getNumber(int a) {
		return a+1;
	}
}

class CastingEx03  extends Super {

	@Override
	public int getNumber(int a) {
		return a+2;
	}

}		
public class Ex17_02{
	public static void main (String args[]) { 

		Super a = new CastingEx03 (); 
		System.out.println(a.getNumber(0)); //2

		if(a instanceof CastingEx03) {
			CastingEx03 Ce =(CastingEx03)a;
			System.out.println(Ce.getNumber(0));
		}
	}

}


