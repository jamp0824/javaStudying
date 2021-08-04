class Parent{
	private int a;
			int b;
	protected int c;
	public int d;
}
class Child extends Parent { //[1]
	public Child(int a,int b,int c,int d) {
		//this.a=a; //[1] =>Parent조상클래스의 해당 멤버변수는 a는 private 으로 정의되었기 때문에 외부 클레스에서는 접근못함
		//=>보안성
		this.b=b; //[2]
		this.c=c; //[3]
		this.d=d; //[4]
		
	}
	void func() { //[5]
		//System.out.println(a);//[5]
		System.out.println(b);//[6]
		System.out.println(c);//[7]
		System.out.println(d);//[8]
				
	}

}
class Ex16_2{//[9]
	public static void main(String[] args) {
		
		Child one = new Child(1,2,3,4);
		one.func();
		
		//System.out.println(one.a); //[9]
		System.out.println(one.b); //[10]
		System.out.println(one.c); //[11]
		System.out.println(one.d); //[12]
	}
}
