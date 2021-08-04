import com.abc.model.ShapeClass;
import com.abc.model2.Circ;
import com.abc.model2.Rect;
import com.abc.model2.Tria;

public class AbsTest06 {
	public static void main(String[] args) {
		
		ShapeClass[] arr=new ShapeClass[3]; //배열크기가 3인 arr배열 생성
		arr[0]=new Circ(); //업캐스팅하면서 배열원소로 저장
		arr[1]=new Rect(); 
		arr[2]=new Tria();
		
		for(int i =0;i<arr.length;i++) {
			arr[i].draw();
		}//for
	}

}
