import java.util.Stack;

class Coin{
	private int value;

	public Coin(int value) {
		this.value=value;
	}
	//이클립스로 getter메서드만 만들어 보라.
	public int getValue() {
		return value;
	}//getter()메서드=> 값 반환 메서드
}
public class ListMap15 {
	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<>();
		coinBox.push(new Coin(500)); //스택에 객체를 넣는다/
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));

		while(!coinBox.isEmpty()) {//동전케이스에 동전이 있다면
			//Coin coin=coinBox.pop(); //동전케이스에 제일위의 동전을 꺼내서 제거
			Coin coin=coinBox.peek(); //스택의 맨위 객체를 얻어옴. 객체를 스택에서 제거하지 않음
			System.out.println("꺼내온 동전: "+coin.getValue()+"원");
		}
	}


}
