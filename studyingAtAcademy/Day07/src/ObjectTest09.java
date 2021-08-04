class MyDate09{
	int year=2019;
	int month=12;
	int day=31;
}
class RefMethod{
	void changeDate(MyDate09 t) {	//MyDate09 t=d가 된다. 주소값을 공유한다.
		t.year=2020; t.month=5; t.day=6;
	}
}
public class ObjectTest09 {

	public static void main(String[] args) {
		RefMethod rf=new RefMethod();
		MyDate09 d = new MyDate09();
		System.out.println("함수 호출 전:"+d.year+"년"+d.month+"월"+d.day+"일");
		rf.changeDate(d);
		System.out.println("함수 호출 후:"+d.year+"년"+d.month+"월"+d.day+"일");
	}

}
