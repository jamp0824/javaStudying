
class Person123{
	String name;
	int age;
	int tall;
	Person123(){}
	Person123(String name, int age, int tall){
		this.name=name;
		this.age=age;
		this.tall=tall;
	}
	void info() {
		System.out.println(this.name);
		System.out.println(this.age+ "세");
		System.out.println("키 : "+this.tall);
	}

}
public class Quiz03 {
	public static void main(String[] args) {
		Person123 p1 = new Person123("홍길동",20,180);
		p1.info();
		System.out.println("====================");
		
		Person123 p2 = new Person123();
		p2.age=40;
		p2.name="김길동";
		p2.tall=170;
		
		p2.info();
		
	}
}

