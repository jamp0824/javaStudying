class Animal{
	protected String kind;
	protected int leg;

	Animal(){}

	Animal(String kind,int leg){
		this.kind=kind;
		this.leg =leg;
	}
	public void getKind() {
		if(kind.equals("소녀")){
			System.out.println(kind+"사람이다");
		}else {
			System.out.println(kind+"동물이다");
		}//if else
	}//getKind

	public void walk() {
		if(leg==2) { // 기본타입 == 로 비교하면 값을 비교 
			System.out.println("사람은"+leg+"발로 걷는다");
		}else {
			System.out.println("동물은"+leg+"발로 걷는다");

		}
	}//walk
}//Animal class

class Human extends Animal{
	Human (){}
	Human(String kind,int leg){
		super(kind,leg); //조상 animal클래스 오버로딩된 생성자 호출

	}
}//Human class

class Dog extends Animal{
	Dog(){}
	Dog(String kind, int leg){
		super(kind,leg);
	}
}// class Dog
public class Ex16_15_1 {
	public static void main(String[] args) {
		
		Human human = new Human("소녀",2);
		Dog dog= new Dog("강아지",4);
		
		human.getKind();
		dog.getKind();
		human.walk();
		dog.walk();
	}

}
