class Block14{
	static {
/* static {} 이 영역을 정적(클래스) 초기화 블록이라고 한다. 정적변수 초기화에 사용된다.
 * 해당 클래스가 실행될 때 딱 한번만 수행된다.
 */
		System.out.println("static {} 정적초기화 블록");
	}
	{
/*{} 이 영역을 인스턴스 초기화 블록이라고 한다. 인스턴스 변수 초기화에 사용된다. 인스턴스 초기화 블록은 생성자와 같이 
 *   객체 생성될 때 마다 수행된다. 생성자 보다 인스턴스 초기화 블록이 먼저 수행된다. 인스턴스 변수 초기화는 주로 생성자를
 *   사용하고, 인스턴스 초기화 블럭은 모든 생성자에서 공통적으로 수행되어야 하는 코드를 작업할 때 사용한다.
 */
		System.out.println("{} 인스턴스 초기화 블록");
	}
	
	public Block14() {
		System.out.println("기본생성자");
	}
}
public class ConsTest14 {
	public static void main(String[] args) {
		new Block14();
		new Block14();
		
		/*	static {} 정적초기화 블록			
			{} 인스턴스 초기화 블록
			기본생성자
			{} 인스턴스 초기화 블록
			기본생성자
		*/
	
	}

}
