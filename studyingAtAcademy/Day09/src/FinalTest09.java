class Point11 {
	int x =10;
	int y =20;
	
	Point11(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Point10 extends Point11{
	int z=30;
	
	Point10(){
		this(100,200,300);
	}
	Point10(int x,int y, int z){
		super(x,y); //조상클래스 오버로딩 된 생성자 호출
		this.z=z;
	}
	void p() {
		System.out.println("x="+x+", y="+y+", z="+z);
	}
}
public class FinalTest09 {
public static void main(String[] args) {
	Point10 p = new Point10();
	p.p();
}
}
