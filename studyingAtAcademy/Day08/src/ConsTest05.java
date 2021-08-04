class Calculator{
	
	int plus(int x, int y) {
		return x+y;
	}//덧셈
	
	double avg(int x, int y) {
		double sum=plus(x,y); //int 타입 인자값이 double 타입 실수 타입으로 자동형변환이 되어져서 
		//덧셈 결과값 저장
		double result=sum/2; //double/int->double/double->double(자동산술법)
		return result;
	}//평균
	
	void execute() {
		double result = avg(7,10);//평균반환
		print("평균= "+result);
	}
	void print(String message) {
		System.out.println(message); //평균값 출력
	}
}
public class ConsTest05 {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.execute();
	}

}
