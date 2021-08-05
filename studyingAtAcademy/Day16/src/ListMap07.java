import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ListMap07 {
	public static void main(String[] args) {
		TreeSet<String> tset=new TreeSet<>();
/*	Set컬렉션 인터페이스를 구현한 TreeSet컬렉션 클래스)
 * 	1.java 2에서 추가되었고, 영어는 알파벳순서, 한글은 가나다순, 숫자는 작은 숫자부터 정렬된다. => 오름차순 정렬
 */
		tset.add("milk"); tset.add("bread"); tset.add("orange");
		System.out.println(tset);
		
		TreeSet<Integer> tset2=new TreeSet<>();
		tset2.add(10); tset2.add(5); tset2.add(13);
		System.out.println(tset2);
		
		TreeSet<String> tset3=new TreeSet<>();
		tset3.add("서울"); tset3.add("부산"); tset3.add("하남");
		System.out.println(tset3);
		
		LinkedHashSet<String> hlist=new LinkedHashSet<>();
/*	Set인터페이스를 구현한 컬렉션 클래스 LinkedHashSet특징)
 *  1.JAVA 4버젼에서 추가되었고, HashSet의 문제점인 저장된 순서의 불명확성을 제거함. 저장된 순서와 같게
 * 	출력된다.
 */
		hlist.add("milk"); hlist.add("bread"); hlist.add("ham");
		System.out.println(hlist); 
		
		hlist.add("우유"); hlist.add("빵"); hlist.add("햄");
		System.out.println(hlist);
	}

}
