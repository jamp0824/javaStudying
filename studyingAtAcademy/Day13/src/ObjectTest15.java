import java.util.Calendar;

public class ObjectTest15 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
/*	1.Calender는 추상클래스로 new 키워드로 객체 생성을 못함
 * 	2.년월일 시분초등 날짜 시간값을 반환한다
 */
		int year = now.get(Calendar.YEAR); //년도값
		int month = now.get(Calendar.MONTH)+1; //월값, +1을 한 이유는 1월이 0으로 반환되기 때문이다.
		int date = now.get(Calendar.DAY_OF_MONTH);//일값
		
		int week = now.get(Calendar.DAY_OF_WEEK); //요일
		String strWeek = null; 
		switch(week) {
		case Calendar.MONDAY: strWeek="월";break;
		case Calendar.TUESDAY: strWeek="화";break;
		case Calendar.WEDNESDAY: strWeek="수";break;
		case Calendar.THURSDAY: strWeek="목";break;
		case Calendar.FRIDAY: strWeek="금";break;
		case Calendar.SATURDAY: strWeek="토";break;
		default: strWeek="일";
		}//switch~case
		
		int amPm=now.get(Calendar.AM_PM); //오전/오후
		String strAmPm=null;
		if(amPm == Calendar.AM) {
			strAmPm="오전";
		}else {
			strAmPm="오후";
		}
		int hour=now.get(Calendar.HOUR); //시간 값
		int minute=now.get(Calendar.MINUTE); //분
		int second =now.get(Calendar.SECOND); //초
		
		System.out.println(year+"년"+month+"월"+date+"일");
		System.out.println(strWeek+"요일");
		System.out.println(strAmPm+" : "+hour+"시 "+minute+"분 "+second+"초");
	}

}
