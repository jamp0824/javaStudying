class Mt08{
	void p(int a) {
		System.out.println(a);
	}
	void p(int a,int b) {
		System.out.println(a+","+b);
	}
	void p(int ...arr) {
		/*	int ... arr은 자바 1.5에서 추가된 가변인자 문법이다.
		 *	가변인자 문법 특징)
		 *	1. 전달인자 갯수가 다른 메서드가 오버로딩 된 경우 int ... arr 가변인자로 받아서 처리하면 
		 *  배열로 저장이 되어져서 반복문으로 실행해서 인자값을 출력한다.
		 */
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();	//줄바꿈
	}	//매게변수 즉 전달인자 개수를 다르게 한 메서드 오버로딩
}
public class ObjectTest07 {
	public static void main(String[] args) {
		Mt08 m= new Mt08();
		m.p(10); m.p(10,20);
		m.p(10,20,30);
		m.p(10,20,30,40);
	}
}
