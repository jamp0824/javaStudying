import java.util.ArrayList;
import java.util.ListIterator;

public class ListMap08 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();

		list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);

		ListIterator<Integer> it=list.listIterator();
		/*		Iterator 인터페이스를 구현상속한 자손 인터페이 ListIterator특징)
		 * 		 1. 자바 2에서 추가되었고, 양방향으로 접근가능함. 단 List컬렉션 인터페이스를 구현 상속한 자손클래스에서만 
		 * 		  사용가능하다.
		 * 		 
		 * 		 Iterator 인터페이스는 단방향 즉 다음원소값만으로만 접근가능하다. 
		 */
		while(it.hasNext()) {//다음원소값이 존재하면 참=>순방향으로 진행하면서 읽어옴.
			System.out.print(it.next()+" "); //next()메서드로 다음원소값을 가져옴.
		}
		System.out.println(); //줄바꿈
		while(it.hasPrevious()) { //역박향으로 이전값이 존재하면 참
			System.out.print(it.previous()+" "); //이전 원소값을 읽어옴ㄴ
		}
	}

}
