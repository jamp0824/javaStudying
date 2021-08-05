import java.util.Enumeration;
import java.util.Hashtable;

public class List16 {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
/*	java util의 Map 컬렉션 인터페이스를 구현상속한 컬렉션 클래스 Hashtable)
 * 	 1.java 1.0에서 추가되었고 키, 값 쌍으로 저장하는 사전적인 자료구조이다.
 *   2.중복키는 허용안하고, 중복값은 허용한다. 키를 통해서 값을 저장하기 떄문에 검색속도가 빠르다.
 * 	 3.저장되는 순서는 유지하지 않는다.
 */
		ht.put("apple","사과"); //put(키,값)으로 쌍으로 저장
		ht.put("grape","포도"); 
		ht.put("banana","바나나"); //put()메서드로 키,값 쌍이 Object타입으로 업캐스팅하면서 저장됨
		
		String val="";
		Object objValue=ht.get("grape"); //grape키이름으로 값을 검색
		if(objValue instanceof String) {
			val=(String)objValue; //명시적인 다운캐스팅
		}
		if(val !=null) {
			System.out.println("grape: "+val);
		}
		Enumeration Enum =ht.keys();
		while(Enum.hasMoreElements()) {
			Object k = Enum.nextElement(); //키를 구함
			Object v = ht.get(k); //키에 대한 값을 구함
			System.out.println(k+ " : "+v);
		}
	}

}
