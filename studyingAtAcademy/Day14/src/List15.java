import java.util.LinkedList;
import java.util.Stack;

public class List15 {
	public static void main(String[] args) {
		Stack st = new Stack();
/* java.util 패키지의 컬렉션 클래스 Stack)
 * 1.java 1.0에서 추가되었고 입구와 출구가 같다. 그러므로 가장 먼저 입력된 자료가 가장 나중에 출력된다.
 * First Input Last Output(FILO), 가장 나중에 입력된 것이 가장 먼저 나간다.(LIFO: Last Input First Out)
 */
		st.push("1-java"); st.push("2-oracle"); st.push("3-jsp/서블릿"); st.push("스피링");
		//push()메서드로 스택 맨위에 원소값을 추가
		
		while(!st.isEmpty()){//스택에 값이 있다면
			System.out.println(st.pop()); 	//pop()메서드로 스택의 맨 위의 원소값을 제거하면서 값을 반환한다.
		}
		System.out.println("\n===================>");
		LinkedList myQue = new LinkedList();
/*	1.입구와 출구가 다르다. 그러므로 가장 먼저 입력된 것이 가장 먼저 나가는 구조이다.(First Input First OutPut:FIFO)
 * 
 */
		myQue.offer("1-java"); //해당 컬렉션에 요소값 추가
		myQue.offer("2-oracle"); myQue.offer("3-javascript");
		
		while(myQue.peek() != null) {//peek()는 해당컬렉션이 비어있다면 null이다. 비어있지 않다면
			System.out.println(myQue.poll()); //컬렉션에 원소값을 꺼내옴.
		}
	}

}
