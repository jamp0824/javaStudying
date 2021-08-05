public class Try05 {
	public static void main(String[] args) {
		try {
			Class clazz=Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("String2클래스 파일이 존재하지 않습니다!");
		}

	}

}
