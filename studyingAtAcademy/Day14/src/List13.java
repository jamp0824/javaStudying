import java.util.ArrayList;
import java.util.List;

public class List13 {

	public static void main(String[] args) {
/* java.util 패키지의 컬렉션 클래스 List특징)
 * 1.가변적크기의 복수개의 타입의 하나이상의 원소값을 한꺼번에 저장할 수 있는 컬렉션 자료구조이다.
 * 2.저장된 원소값의 순서를 유지한다.
 * 3.중복원소값을 허용한다.
 */
		List list = new ArrayList(); //조상 타입으로 업캐스팅
		list.add(10); list.add(10.3); list.add(10); list.add("이순신"); list.add(false); 
		//The method add(Object) 10 int -> interger 오토박싱 -> Object타입으로 업캐스팅
		System.out.println("컬렉션 크기: "+list.size());
		System.out.println(list);
		
		for(int i =0;i<list.size();i++) {
			System.out.print(list.get(i)+" "); //get()메서드로 컬렉션 원소값을 가져옴.
		}
		System.out.println("\n=================>");
		//향상된 확장 for
		for(Object obj:list) {
			System.out.print(obj+" ");
		}
	}

}










