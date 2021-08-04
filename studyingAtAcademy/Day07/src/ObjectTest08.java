class MyDate{
	int year=2019;
	int month=12;
	int day=31;
}
public class ObjectTest08 {
	public static void main(String[] args) {
		int x=7;
		int y=x;
		MyDate d = new MyDate();//new로 새로운 객체명을 만들면 d참조변수에는 주소값이 저장됨.
		System.out.println("x="+x+",y="+y);
		System.out.println(d.year+"년"+d.month+"월"+d.day+"일");
		MyDate t =d; //t참조변수에 d객체주소를 저장함. t와 d는 같은 객체주소를 사용함
		
		t.year=2020; t.month=5; t.day=31;
		System.out.println(d.year+"년"+d.month+"월"+d.day+"일");
		//같은 주소를 공유하기 때문에 d로 접근하는 멤버변수값도 함께 변경됨.
		System.out.println(t.year+"년"+t.month+"월"+t.day+"일");
		
		y=10; //기본타입변수는 주소값을 공유하지 않기 때문에 x 변수값에 영향을 미치지 않는다.
		System.out.println("x="+x+",y="+y);
	}

}
