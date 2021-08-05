import java.util.Enumeration;
import java.util.Hashtable;

public class ListMap01 {
	public static void main(String[] args) {
		Hashtable<String,String> ht= new Hashtable<>();//뒷부분 제네릭타입은 생략 자바7버젼부터 사용가능
		//문자열키와 값만 저장가능함
		ht.put("seoul","서울"); ht.put("busan", "부산"); ht.put("incheon","인천");
		//put()으로 키,값 쌍으로 저장 
		String val=ht.get("busan"); //키에 대한 값을 구함
		if(val !=null) {
			System.out.println("busan: "+val);
		}
		Enumeration<String> Enum=ht.keys();
		while(Enum.hasMoreElements()) {//키가 있다면 참
			String k =Enum.nextElement(); //키를 구함
			String v =ht.get(k); //키에 대한 값을 구함
			System.out.println(k+" : "+v);
		}
		
	}

}
