public class OprData10 {
	public static void main(String[] args) {
		
		int a =10;
		a=a+10; //10+10=20
		System.out.println("a="+a);
		
		a=a-5; //확장된 복합대입 연산자 -> 5씩 감소 -> 20-5 -> 15
		System.out.println("a="+a);
		
		a+=5; // 5씩 증가는것 a=a+5
		System.out.println("a="+a);	//20
		
		a-=3; // 3씩 감소하는것 a=a-3 ,3씩 감소 -> 20-3 = 17
		System.out.println("a="+a); //17
		
/* 증가/감소(증감) 연산자)
 * i++(나중에 1증가-> 후행증가), ++i( 먼저 1 증가-> 선행증가), i--(나중에 1감소->후행감소),
 * --i(먼저 1감소-> 선행감소)
 */
		a=10; int b =10;
		++a;			//11
		System.out.println(a);
		b++; 	//후행증가 //11
		System.out.println(b);
		
		
		
	}
}
