import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

class Student{
	private String name;
	private int englishScore;
	private int mathScore;
	
	Student(String name, int englishScore, int mathScore){
		this.name=name;
		this.englishScore=englishScore;
		this.mathScore=mathScore;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
}
public class FunctionTest08 {
	private static List<Student>list=Arrays.asList(
			new Student("홍길동",90,96),
			new Student("이순신",95,93)
			);//asList()는 제네릭 메서드로 배열을 컬렉션 List로 변경
	static double avg(ToIntFunction<Student> function) {
//ToIntFunction함수형 인터페이스는 매개값과 리턴값이 있는 인터페이스로 매개값을 받아서 리턴값으로 매핑 즉
//타입 변환을 해준다.객체 T를 int로 변환
		int sum=0;
		for(Student student: list) {
			sum+=function.applyAsInt(student);
		}
		double avg=(double)sum/list.size(); //double/int 자동 산술법에 의해서 double/double
		// 나눗셈하면 몫과 나머지 까지 평균을 구함
		return avg;
	}
	public static void main(String[] args) {
		double englishAvg=avg(s->s.getEnglishScore());
		System.out.println("영어 점수 평균="+englishAvg);
		double mathAvg=avg(s->s.getMathScore());
		System.out.println("수학점수 평균="+mathAvg);
	}
	

}
