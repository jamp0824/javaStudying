import java.util.TreeSet;

public class ListMap11 {
	public static void main(String[] args) {
		TreeSet<Integer> score=new TreeSet<>();
		score.add(new Integer(87)); score.add(new Integer(98));
		score.add(new Integer(75)); score.add(new Integer(95));
		score.add(new Integer(80));
		
		Integer score2=null;
		score2=score.first();
		System.out.println("가장 낮은 점수= "+score2); //75
		
		score2=score.last();
		System.out.println("가장 높은 점수= "+score2); //98
		
		score2=score.lower(new Integer(95));
		System.out.println("95점보다 아래점수= "+score2); //87
		
		score2=score.higher(new Integer(95));
		System.out.println("95점보다 위점수= "+score2); //98
		
		while(!score.isEmpty()) {
			score2=score.pollFirst(); //가장 낮은 점수를 꺼내오면서 컬렉션에서 제거
			System.out.println(score2+ "(남은 원소 개수: "+score.size()+")");
		}
	}

}
