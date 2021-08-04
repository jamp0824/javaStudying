class People{
	public String name; //이름
	public String ssn; //주민번호
	
	public People(String name,String ssn) {
		this.name=name;
		this.ssn=ssn;
	}//생성자 오버로딩
}
class Student extends People{//class 자손클래스 extends 조상클래스 => 클래스 상속은 단일상속만 가능하다.
	
	public int studentNo; //학번
	
	public Student(String name,String ssn,int studentNo) {
		super(name,ssn); //조상클래스 오버로딩 된 생성자 호출
		this.studentNo=studentNo;
	}
	void p() {
		System.out.println("학생명: "+this.name); //this. 은 생략가능
		System.out.println("학번: "+studentNo); //
	}
}
public class FinalTest14 {
	public static void main(String[] args) {
		Student student=new Student("홍길동","123456-1234567",11);//오버로딩된 생성자 호출
		//System.out.println("학생명: "+student.name);
		//System.out.println("학번: "+student.studentNo);
		student.p();
/* 문제) 22번,23번 라인 출력부분을 Student클래스 소속 void p(){}해서 출력하는 코드를 완성하세요,
 * 
 */
	}

}
