class Animal{
	protected String kind;
	protected int leg;
	public Animal(){
		super();
	}
	Animal(String kind, int leg){
		super();
		this.kind=kind;
		this.leg=leg;
	}
	
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	void walk(){
		if(this.leg==4) {
		System.out.println(this.kind+"는"+leg+"발로 걷는다");
	}else if(this.leg==2) {
		System.out.println("사람"+leg+"발로 걷는다");
	}
	
	}
}//Animal
class Human extends Animal{
	Human(String kind, int leg){
		super(kind,leg);
	}
	


	@Override
	public String getKind() {
		System.out.println(this.kind+"사람이다");
		return super.getKind();
	}



	@Override
	public void setKind(String kind) {
		super.setKind(kind);
	}



	@Override
	void walk() {
		// TODO Auto-generated method stub
		super.walk();
	}

	public void speak() {
		System.out.println("HelloWorld!");
	}
}
class Dog extends Animal{
	
	Dog(String kind,int leg){
		super(kind,leg);
	}
	

	@Override
	public String getKind() {
		System.out.println(this.kind+"동물이다");
		return super.getKind();
	}


	@Override
	public void setKind(String kind) {
	super.setKind(kind);
	}


	@Override
	void walk() {
		// TODO Auto-generated method stub
		super.walk();
	}

	public void bike() {
		System.out.println("멍멍하고 짖습니다.");
	}
}
public class Ex16_04 {
	public static void main(String[] args) {
		Dog d = new Dog("강아지",4);
		Human h =new Human("소녀",2);
		
		d.getKind();
		d.walk();
		h.getKind();
		h.walk();
	}
}
