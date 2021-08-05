import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx01 {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("홍길동","이순신","강감찬"); //배열을 컬렉션 List로 전환
		
		//Iterator 사용
		Iterator<String> iterator=list.iterator(); 
		while(iterator.hasNext()) {
			String name=iterator.next();
			System.out.println(name);
		}
		System.out.println();
		
		//자바8의 스트림 사용
		Stream<String> stream=list.stream();
		stream.forEach(name->System.out.println(name));
	}
}
