//1.Animal클래스에 생성자를 추가하세요
class Animal{
	String name;
	int age;
	Animal(String name, int age){
		this.name=name;
		this.age=age;
	}//매개변수 2개인 생성장 오버로딩
	public void show() {
		System.out.println(this.name+"는(은)"+age+"살입니다.");
		//this.은 생략가능
	}
}
public class Ex13_01 {
	public static void main(String[] args) {
		Animal a1= new Animal("원숭이",26);
		a1.show();
	}

}
