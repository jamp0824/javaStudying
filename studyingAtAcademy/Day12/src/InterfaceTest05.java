interface IHello05{
	void hello(int k);
}
interface IGoodBye05{
	void arrSum(int[] arr);
}
interface ITotal extends IHello05,IGoodBye05{
	//인터페이스에서 인터페이스간의 상속은  extends 예약어를 사용한다.
	void greeting(String name); //public abstract 가 생략됨
}
class SubClass05 implements ITotal{

	@Override
	public void hello(int k) {
		for(int i=1; i<=k; i++) {
			System.out.println("========");
			System.out.println(i+"단");
			for(int j=1; j<=k; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}System.out.println("==========");
	}
	

	@Override
	public void arrSum(int[] arr) {
		int sum=0;
		
		for(int i:arr) {
			sum+=i;
		}//for
		System.out.println("100+200+300의 누적합은 "+sum);
		System.out.println("===================");
	}

	@Override
	public void greeting(String name) {
		System.out.println(name+"님 반가워");
	}

}
public class InterfaceTest05 {

	public static void main(String[] args) {
		/*	문제) 각각의 추상메서드를 오버라이딩을 해서 구구단중에 9단값, 100+200+300의 배열원소 누적합, 홍길동님 반가워
		 *  요라는 값을 출력되게 하는 코드를 작성한다.
		 * 
		 */
		SubClass05 sc= new SubClass05();
		int[]arr= {100,200,300};
		sc.hello(9);
		sc.arrSum(arr); //arr 배열은 참조타입이기 떄문에 번지 주소값이 전달
		sc.greeting("홍길동");
	}

}
