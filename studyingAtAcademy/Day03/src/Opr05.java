public class Opr05 {
	public static void main(String[] args) {
		
		int a =12;
		int b =20;
		int c =a&b;
		System.out.println(a+" & "+b+" : "+c);	//4
		
		c =a|b;
		System.out.println(a+" | "+b+" : "+c);  //28
		
		c =a^b;
		System.out.println(a+" ^ "+b+" : "+c);	//24
		
		c =~a;
		System.out.println(" ~ "+a+" : "+c);	//-13
		
		byte x = 15;
		System.out.println(x+"<<2: "+(x<<2));	//60
		System.out.println(x+">>2: "+(x>>2));	//3
		System.out.println("-8>>3:"+(-8>>3)); 	//-1
		System.out.println("-8>>>3:"+(-8>>>3));
	}
}
