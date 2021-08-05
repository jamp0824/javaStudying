class Point2D{
	protected int x=10;
	protected int y=20;
/* 생성자가 오버로딩 된 경우 자바 컴파일러(javac)는 묵시적인 기본생성자를 제공하지 않는다. */
	//public Point2D(int x, int y) {
		//this.x=x;
		//this.y=y;
	//}
}
class Point4D extends Point2D{
	protected int z=30;
	
	public Point4D() {
		super(); //조상 클래스 기본생성자를 호출하려다가 에러가 발생
	}
}
public class FinalTest07 {

	public static void main(String[] args) {

	}

}
