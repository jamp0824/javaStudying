class RectArea{
	
	double areaRectangle(double width) {
		return width*width; //너비*너비
	}//정사각형 넓이
	
	double areaRectangle(double width, double height) {
		return width*height; //너비*높이 => 직사각형 넓이
	}//매개변수 개수를 다르게 한 메서드 오버로딩
}
public class ConsTest07 {
	public static void main(String[] args) {

		RectArea area=new RectArea();
		double result01=area.areaRectangle(10);
		System.out.println("정사각형 넓이="+result01);
		
		double result02=area.areaRectangle(10, 20);
		System.out.println("직사각형 넓이="+result02);
	}

}
