class Data{
	int x;
}
public class ObjectTest10 {

	public static void main(String[] args) {
		Data d=new Data();
		d.x=10; //x 멤버변수에 값이 저장
		Data d2=copy(d);
		//d2=tmp =>d2와 tmp는 주소값이 같고, d는 다른 주소값을 가짐.
		System.out.println("d.x="+d.x); //10
		System.out.println("d2.x="+d2.x); //10
		d2.x=100;
		System.out.println("d.x="+d.x);
	}//main()
	static Data copy(Data d) {
		Data tmp =new Data();
		tmp.x=d.x; //tmp,d는 객체주소가 다르다. tmp.x에는 값이 저장됨
		
		return tmp; //반환되는 것은 tmp객체주소가 반환
	}

}
