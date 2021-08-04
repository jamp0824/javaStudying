class Animal01 {//class 키워드로 Animal01 클래스 정의
	String name; //name,age는 클래스 소속 멤버변수{필드,속성)
	int age; //멤버변수 초기값=>int타입은 0,String 타입은 null
}
class Thing{
	int x;
}
public class ObjectTest01 {
public static void main(String[] args) {
	Animal01 a;	//번지주소가 저장안된 참조변수
	a= new Animal01();	//new로 번지 주소가 저장된 참조변수 a=>객체명(인스턴스)
	a.name="홍길동"; a.age=25;
	System.out.println("이름: "+a.name);
	System.out.println("나이: "+a.age);
	
	Animal01 b=new Animal01();
	b.name="펭귄"; b.age=12;
	System.out.println("이름은 "+b.name+"\n나이는 "+b.age);
	
	Thing c=new Thing();
	c.x=10;
	System.out.println(c.x);
}

}
