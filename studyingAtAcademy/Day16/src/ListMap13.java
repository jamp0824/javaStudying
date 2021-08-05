import java.util.Map;
import java.util.TreeMap;

public class ListMap13 {
	public static void main(String[] args) {
		TreeMap<Integer,String> scores=new TreeMap<>();
		scores.put(new Integer(87),"홍길동");
		scores.put(new Integer(98),"이동수");
		scores.put(new Integer(75),"박길순");
		scores.put(new Integer(95),"신용권");
		scores.put(new Integer(80),"김자바");
		
		Map.Entry<Integer,String> entry=null;
		entry=scores.firstEntry();
		System.out.println("가장 낮은 점수= "+entry.getKey()+" : "+entry.getValue());
		//키,값 출력=> 점수: 학생명이 출력
		entry=scores.lastEntry();
		System.out.println("가장 높은 점수= "+entry.getKey()+" : "+entry.getValue());
		entry=scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래점수= "+entry.getKey()+" : "+entry.getValue());
		
		entry=scores.higherEntry(95);
		System.out.println("95점 위 점수= "+entry.getKey()+" : "+entry.getValue());
		
		while(!scores.isEmpty()) {
			entry=scores.pollFirstEntry(); //제일 낮은 점수부터 꺼내면서 컬렉션에서 제거함
			System.out.println(entry.getKey()+" - "+entry.getValue()+"(남은원소개수= "+scores.size()+")");
		}
	}
}
