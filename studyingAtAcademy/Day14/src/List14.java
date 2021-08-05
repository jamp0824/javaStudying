
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class List14 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10.3); list.add(10.3); list.add(8); list.add("홍길동");
		list.add("이순신"); //add()메서드로 복수개의 원소값을 저장
		
		Iterator elements = list.iterator();
/*	java.util 패키지의 Iterator 인터페이스 특징)
 * 	1.java 2 버젼에서 추가되었고 컬렉션에 저장된 복수개의 원소값을 쉽게 읽어오는 용도로 활용됨
 */
		while(elements.hasNext()) {
//hasNext()메서드는 다음 원소값이 있다면 참
			System.out.print(elements.next()+" ");	//next()메서드로 다음원소값을 가져옴
		}
		System.out.println("\n===================>");
		Vector v = new Vector();
/*	java.util패키지의 Vector컬렉션 클래스)
 *	1.가변적 크기의 복수개 타입의 하나이상의 원소값을 한꺼번에 저장할 수 있다.
 *  2.자바 1버젼에서 추가됨.
 */
		v.add(100); v.add(200); v.add(100); v.add(95.7); list.add("홍길동");
		Enumeration enu=v.elements();
/* java.util의 Enumeration인터페이스의 특징)
 * 	1.자바 1.0에서 추가된 것으로 컬렉션에 저장된 복수개의 원소값을 읽어오는 용도로 활용됨.
 */
		while(enu.hasMoreElements()) {//요소값이 있다면 참
			System.out.print(enu.nextElement()+" "); //nextElement()메서드로 원소값을 얻어냄.
		}
	}

}
