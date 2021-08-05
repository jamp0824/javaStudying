import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxExample {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("blue",96);
		map.put("hong",86);
		map.put("white",92);
		
		String name=null; //최고점수를 받은 아이디를 저장
		int maxScore=0; //최고점수
		int totalScore=0; //점수 합계
		
		Set<Map.Entry<String,Integer>>entrySet=map.entrySet();
		for(Map.Entry<String,Integer> entry:entrySet) {
/*	 과제물)1.최고점수를 받은 아이디와 최고점수를 구하는 알고리즘 코드를 작성해 보세요.
 * 		  2.점수 합계를 구하세요
 * 		  3.double 점수 평균을 구해 보세요. 출력물은 평균점수, 최고점수, 최저점수를 받은 아이디를 각각
 * 			출력하시면 됩니다.	
 */
			if(entry.getValue()>maxScore) {
				maxScore=entry.getValue();
				name=entry.getKey();
			}//if
			totalScore+=maxScore;
			
		}
		System.out.println("최고점수를 받은 아이디 :"+name);
		System.out.println("최고점수는 :"+maxScore);
		System.out.println("점수 합계 :"+totalScore);
		System.out.println("평균 점수 :"+(double)totalScore/entrySet.size());
		//실수/정수는 자동산술법에 의해서 실수/실수=몫과 나머지
		
	}

}
