class Animal02{
	String name;
	private int age; //private 접근권한 제어자로 선언된 age멤버변수는 Animal02클래스 밖에서 접근 못함.

public void setAge(int new_age) {
	age=new_age;
}
public int getAge() {
	return age;//멤버변수값을 return 으로 getAge()메서드 호출한 곳으로 바노한
}
}

public class ObjectTest02 {
	public static void main(String[] args) {
		Animal02 a=new Animal02(); //new로 객체주소가 저장된 참조변수 a생성=> 객체면
		a.name="홍길동"; a.setAge(26);
		System.out.println("이름: "+a.name+"\n나이: "+a.getAge());
	}

}
