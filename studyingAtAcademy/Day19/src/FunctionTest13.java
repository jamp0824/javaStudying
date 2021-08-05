import java.util.function.BiFunction;
import java.util.function.Function;

class Member21{
	private String name;
	private String id;
	
	Member21(){
		System.out.println("Member2() 실행");
	}
	Member21(String id){
		System.out.println("Member(String id) 실행");
		this.id=id;
	}
	Member21(String name, String id){
		System.out.println("Member(String name, String id)실행 ");
		this.name=name;
		this.id=id;
	}
}
public class FunctionTest13 {
	public static void main(String[] args) {
		Function<String, Member21>function1 = Member21 :: new; //생성자 참조
		Member21 member1 = function1.apply("java8"); //매개변수 1개짜리 오버로딩된 생성자 호출
		
		BiFunction<String,String,Member21>function2 = Member21 ::new;
		Member21 member2=function2.apply("java", "oracle"); 
	}

}
