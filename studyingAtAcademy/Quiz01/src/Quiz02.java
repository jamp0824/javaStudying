class Person{
	String name;
	int age;
	
	void info() {
		System.out.println(name);
		System.out.println(age+ "세");
	}
}
public class Quiz02 {
public static void main(String[] args) {
	Person person = new Person();
	Person person2 = new Person();
	person.name="홍길동"; person.age=19;
	person.info();
	
	person2.name="김길동"; person2.age=30;
	person2.info();
}
}
