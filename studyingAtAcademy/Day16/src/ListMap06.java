import java.util.ArrayList;
import java.util.List;

public class ListMap06 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Java"); list.add("JDBC"); list.add("Servlet/JSP");
		list.add("mybatis"); list.add(2,"Data(oracle)"); //3번째 지정된 값으로 저장
		
		int size=list.size(); //컬렉션 원소개수
		System.out.println("총 개수: "+size); //5
		System.out.println(); //줄바꿈
		
		String skill=list.get(2); //3번째 원소값을 가져옴. 주소 인덱스번호가 0부터 시작
		System.out.println("세번째 원소값:"+skill);
		System.out.println();
		
		//향상된 확장 for로 컬렉션 원소값 가져오기
		for(String subject: list) {
			System.out.println(subject+" ");
		}
		System.out.println("\n=====================>");
		list.remove(2);
		list.remove("mybatis"); //mybatis삭제
		
		//문제) 일반 for로  컬렉션 원소값을 가져와서 출력하자.
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}

}
