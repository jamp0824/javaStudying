import java.util.Arrays;
import java.util.List;

class MyList{
	static void printList(List<?>list) {
/* <?> 제네릭 와일드 카드는 모든 클래스, 인터페이스 타입으로 형변환이 가능하다.
 */
		for(Object obj:list) {
			System.out.println(obj+" ");
		}
		System.out.println( ); //개행
	}
}
public class Generic05 {
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(10,20,30);
		MyList.printList(li);
		List<String> li02=Arrays.asList("one","two","three"); //배열을 컬렉션으로 변경
		MyList.printList(li02);
	}

}
