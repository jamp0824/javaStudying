import java.util.function.ToIntFunction;

public class FunctionTest16 {
	static class Student{
		private String name;
		private int englishScore;
		private int mathScore;
		
		Student(String name, int englishScore, int mathScore){
			this.name=name; this.englishScore=englishScore; this.mathScore=mathScore;
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
		
	}//외부클래스명$내부클래스명.class => FunctionTest16$Student.class
	
	private static Student[] students = {
			new Student("홍길동",90,96),
			new Student("이순신",95,93)
			
	};
	public static double avg(ToIntFunction<Student> function) {
		int sum=0;
		for(Student student:students) {
			sum+=function.applyAsInt(student);
		}
		double avg=(double)sum/students.length;
		return avg;
	}
	
	public static void main(String[] args) {
		//double englishAvg=avg(s -> s.getEnglishScore());
		double englishAvg=avg(Student::getEnglishScore);
		System.out.println("영어 점수 평균= "+englishAvg);
		double mathAvg=avg(Student::getMathScore);
		System.out.println("수학점수 평균= "+mathAvg);
	}

}
