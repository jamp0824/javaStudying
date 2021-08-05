import java.util.Arrays;
import java.util.List;

public class Generic06 {
	static void addNumber(List<? super Integer>list) {
/* <? super Integer> 제네릭 와일드 카드는 Integer 타입 또는 그 조상타입으로는 제네릭 타입 형변환이
 *  가능하다.하한선
 */
	for(int i =0; i<list.size();i++) {
		System.out.print(list.get(i)+" "); //get(i)메서드로 해당 원소값을 가져옴;.
	}
	System.out.println();
	}
	public static void main(String[] args) {
		Number[] arr= {10,20,30};
		List<Number> li=Arrays.asList(arr);
		addNumber(li);
	}
}
