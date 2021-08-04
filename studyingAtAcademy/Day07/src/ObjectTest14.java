class Board14{
	private String writer; //글쓴이
	private String title; //제목
	
	Board14(){} //매개변수가 없는 생성자를 기본생성자를 기본(default) 생성자라고 한다.
	
	Board14(String new_writer,String new_title){
		writer=new_writer; title=new_title;
	}
		
		//매개변수 개수를 다르게 한 생성자 오버로딩
		void p() {
			System.out.println("작성자: "+writer);
			System.out.println("제목: "+title);
	}
}
public class ObjectTest14 {

	public static void main(String[] args) {
		Board14 b = new Board14(); //new Board14()에 의해서 기본 생성자를 호출
		b.p();
		Board14 b2 = new Board14("홍길동","제목입니다");
		b2.p();
				
	}

}
