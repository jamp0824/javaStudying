import java.util.Arrays;
import java.util.List;

public class Generic04 {
	static int sumList(List<? extends Number>list) {
/* <?extends Number>제네릭 와일드카드는 Number 조상타입 또는 그 자손타입으로는 제네릭타입 형변환은 할수 있다라는 상한선을 뜻한다.
 */
		int sum=0;
		for(Number n: list) {
			sum +=n.intValue(); //intValue()메서드는 기본 정수숫자로 변경하고 누적합을 구함
		}
		return sum;
	}
	public static void main(String[] args) {
		Integer[] arr = {10,20,30};
		List<Integer> list=Arrays.asList(arr); //asList()제네릭 메서드는 배열을 컬렉션 List로 변경한다 //고정배열->가변배열
		int sum=sumList(list);
		System.out.println("누적합 = "+sum);
	}
}
