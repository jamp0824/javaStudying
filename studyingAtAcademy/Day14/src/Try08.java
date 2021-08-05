class FileInputStream2 implements AutoCloseable{
/*	1.java 7 이후부터 AutoCloseable 인터페이스를 구현 상속받은 자손은 명시적인 close()메서드로 닫지 않아도 
 * 	자동으로 닫힌다. 
 * 	2. 이 문법을 사용할려면 이 인터페이스글 구현상속한 자손클래스 객체를 try()내에서 생성해야 한다.
 */
	private String file;
	
	FileInputStream2(String file){
		this.file=file;
	} //생성자 오버로딩
	
	void read() {
		System.out.println(file+"을 읽습니다.");
	}
	@Override
	public void close() throws Exception {
		System.out.println(file+"닫습니다.");
	}
	
}
public class Try08 {
	public static void main(String[] args) {
		try (FileInputStream2 fis=new FileInputStream2("a.txt")){
			fis.read();
			throw new Exception(); //인위적 예외 발생
		} catch (Exception e) {
			System.out.println("예외처리코드 실행");
		}

	}

}
