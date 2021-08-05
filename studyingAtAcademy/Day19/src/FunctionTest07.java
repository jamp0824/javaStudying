import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntSupplier;

public class FunctionTest07 {
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t+"8");
		//Consumer함수형 인터페이스는 매개값은 있고, 리턴값은 없다.
		consumer.accept("java"); 
		
		BiConsumer<String,String> bigConsumer=(t,u) -> System.out.println(t+u);
		//BiConsumer 인터페이스는 매개변수로 T,U타입을 받아서 처리
		bigConsumer.accept("Java","8");
		
		DoubleConsumer doubleConsumer= d -> System.out.println("Java"+d);
		//DoubleConsumer 인터페이스는 매개 타입으로 double타입 하나만 가진다.
		doubleConsumer.accept(8.0);
		
		System.out.println("============>");
		IntSupplier intSupplier = () -> {
			//IntSupplier함수형 인터페이스는 매개변수가 없고 반환값이 있다. int결과값을 반환한다.
			int num=(int)(Math.random()*6)+1;
			//0.0이상 1.0미만 사이의 실수 숫자 난수를 발생 => *6하면 0.0이상 6.0미만 int로 캐스팅하면 =>
			//0이상 6미만 +1 => 1이상 7미만 결국 1부터 6사이의 주사위 숫자 난수를 발생해서 반환
			return num;
		};
		int num=intSupplier.getAsInt();
		System.out.println("주사위 눈수: "+num);
	}

}
