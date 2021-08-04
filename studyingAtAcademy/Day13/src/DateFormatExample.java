import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
	public static void main(String[] args) {
		
		Date now = new Date(); //Date클래스는 날짜와 시간값을 가진다.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		// 날짜 요일 시간값 출력형태 객체 sdf생성(now);
		System.out.println(sdf.format(now));
	}

}
