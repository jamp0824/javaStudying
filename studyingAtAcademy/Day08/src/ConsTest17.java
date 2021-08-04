class SingleTon{	//싱글톤 객체생성법=>단 하나의 객체만 생성
	private static SingleTon singleTon= new SingleTon();
	private SingleTon() {} //생성자를 외부 클래스에서 접근 못하게 한다.
	
	public static SingleTon getInstance() {
		return singleTon;
	}
}
public class ConsTest17 {
	public static void main(String[] args) {
		//SingleTon obj1=new SingleTon(); 접근못함 private으로 막음
		SingleTon obj01=SingleTon.getInstance(); //싱글톤 객체 반환
		SingleTon obj02=SingleTon.getInstance();
		
		if(obj01==obj02) {//객체주소값을 비교
			System.out.println("같은 객체주소입니다.");
		}else {
			System.out.println("다른 객체주소입니다.");
		}
	}

}
