class St4{
	int b=20;
	//b접근은 St4.b로 직접 접근하거나 생성자를 통해 접근해도 된다.
	static void p() {
		//System.out.println(this.b); //정적메서드에서는  this를 사용할 수 없다.
		//System.out.println(b); //정적메서드내에서는 b 인스턴스 변수를 사용할 수 없다.
		//결국 this와 인스턴스 변수는 인스턴스 메서드 내에서 사용한다.
	}
}
public class ConsTest11 {
	public static void main(String[] args) {
		
	}

}
