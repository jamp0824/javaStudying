public class OprDay11 {
	public static void main(String[] args) {
		
		int a=10,b=10;
		System.out.println(++a); //먼저 1을 증가하고 11이 출력
		
		System.out.println(b++); //먼저 10을 출력하고 나중에 1이 증가
		System.out.println(b);   //11
		
		a=b=10;
		int c;
		
		c=++a; //먼저 1을 증가한 11 값이 c변수에 저장된다
		
		System.out.println(c);	//11
		
		c=b++; //먼저 10을 저장하고 나중에 1증가
		System.out.println(c);  //10
		System.out.println(b);	//11
		
		int i=5,j=5;
		System.out.println(i++);//5
		System.out.println("i ="+i);
		
		System.out.println(++j);//6
		System.out.println("j="+j); //6
	}
}
