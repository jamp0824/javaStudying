class Mt02{
	void pr(int a) {
		System.out.println(a);
	}

	void pr(int ...b) {

		for(int a:b) {
			System.out.print(a+" ");
		}
		System.out.println();	
	}	
}
public class Ex2_02 {

	public static void main(String[] args) {
		Mt02 m = new Mt02();
		m.pr(10);
		m.pr(10,20);
		
	}

}
