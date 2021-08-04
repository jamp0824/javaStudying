class Value{
	int a;
	
	
	Value(int a){
		this.a=a;
	}// 생성자 오버로딩
/*	1.생성자가 오버로딩이 되면 묵시적인 기본생성자를 제공하지 않는다.
 * 
 */
}
public class ObjectTest03 {

	public static void main(String[] args) {
		//Value v03 = new Value(); 생성자가 오버로딩이 되면 묵시적인 기본생성자를 제공하지 않는다.
		Value v01 = new Value(10);
		Value v02 = new Value(10); //new에 의해서 생성된 객체 v01과 v02는 주소값이 다르다.
		
		if(v01.equals(v02)) {//Object조상클래스의 equals()메서드를 상속받아서 비교하면 Object조상입장에서
			//자손클래스 Value에서 추가된 인스턴스변수 a를 모른다. 그러므로 결국 객체 주소값을 비교한다.
			System.out.println("v02와 v01는 같다");
		}else {
			System.out.println("v02와 v01는 다르다.");
		}
	}

}
