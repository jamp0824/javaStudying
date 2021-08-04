class Product16{
	static int count =0;
	int serialNo;
	
	{//인스턴스 초기화 블록
		++count;
		serialNo = count;
	}
	public Product16() {}//기본생성자
}
public class ConsTest16 {
	public static void main(String[] args) {
		Product16 p1 = new Product16(); //객체 생성될때 마다 인스턴스 초기화블록 {}실행
		Product16 p2 = new Product16();
		Product16 p3 = new Product16();
		
		System.out.println("p1제품번호는 "+p1.serialNo);
		System.out.println("p2제품번호는 "+p2.serialNo);
		System.out.println("p2제품번호는 "+p3.serialNo);
		System.out.println("생산된 제품 수:"+Product16.count+" 개입니다.");
	}

}
