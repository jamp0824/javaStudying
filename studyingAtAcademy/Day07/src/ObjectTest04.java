class Tv04{
	String color;
	int channel; //채널번호
}
public class ObjectTest04 {

	public static void main(String[] args) {
		Tv04 t1= new Tv04();
		Tv04 t2= new Tv04();	//t1과 t2의 객체주소는 다르다.
		System.out.println("t1.channel="+t1.channel);
		System.out.println("t2.channel="+t2.channel);
		
		t1.channel=7;
		System.out.println("t1.channel: "+t1.channel); //7
		System.out.println("t2.channel: "+t2.channel); //0
		
		Tv04 t3=t1; //t1과 t3객체 주소는 같게 된다.
		System.out.println("t3.channel: "+t3.channel); //7
		
	}

}
