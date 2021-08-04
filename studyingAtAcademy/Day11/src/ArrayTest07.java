import com.abc.model.ShapeClass;
import com.abc.model2.Circ;
import com.abc.model2.Rect;
import com.abc.model2.Tria;

public class ArrayTest07 {
	static void p(Circ c) {
		c.draw();
	}
	static void p(Rect r) {
		r.draw();
	}
	static void p(Tria t) {
		t.draw();
	}//매개변수 타입을 다르게 한 메서드 오버로딩
	static void p2(ShapeClass ref) {
		//ShapeClass ref로 모든 자손타입을 업캐스팅하면서 받을수 있다. =>다형성
		//다형성=>상속+업캐스팅(다운캐스팅 선택옵션)
		ref.draw();
	}
	public static void main(String[] args) {
		p(new Circ());
		p(new Rect());
		p(new Tria());
		System.out.println("==============>");
		Circ c = new Circ(); Rect r =new Rect(); Tria t=new Tria();
		p2(c); p2(r); p2(t);
	}

}
