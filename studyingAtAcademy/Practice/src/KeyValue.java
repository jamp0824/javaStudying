import java.util.*;

class  Box <T,M>{
	private T key;
	private M value;
	
	Box(){}
	
	Box(T key,M value){
		this.key = key;
		this.value = value;
	}
	
	public void setKey(T key) {
		this.key = key;
	}
	public void setValue(M value) {
		this.value = value;
	}
	
	public T getKey() {return key;}
	public M getValue() {return value;}
}


public class KeyValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Box<Integer,String> box = new Box<>();
		List<Box> li = new ArrayList();
		Random rand = new Random();
		int random = rand.nextInt(10);
		for(int i = 0;i<10;i++) {
			if(i == random) {
				li.add(new Box(i,"당첨"));
			}else {
			li.add(new Box(i,"꽝"));
			}
		}//for
		int su = 0;
		while(true) {
			System.out.print("고르세요 (1~10번)  >> ");
			int a = sc.nextInt();
			System.out.println(a+"번 결과는 ? "+li.get(a-1).getValue()+"입니다~~");
			if(li.get(a-1).getValue().equals("당첨")) {
				System.out.println("당첨 축하드립니다.");
				su = a;
				break;
			}
		}
	
	}
}