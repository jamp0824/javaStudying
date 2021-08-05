class Gu{
	public void guguDan() {
		//코드 작성
		for(int i=1; i<=9; i++) {
			System.out.println("------"+i+"단"+"------");
			for(int j=1; j<9; j++ ) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}

	}
}//Gu class
public class Ex1_01 {
	public static void main(String[] args) {
		Gu g=new Gu();//new로 객체생성
		g.guguDan(); 
	}
}