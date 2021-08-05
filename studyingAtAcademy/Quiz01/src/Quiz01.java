class Bread{
	int price;
	String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void info() {
		System.out.println(price+"원");
		System.out.println(name);
	}
	
	
}
public class Quiz01 {
	
	public static void main(String[] args) {
		Bread bread1 = new Bread();
		bread1.name="피자빵"; bread1.price=500;
		bread1.info();
	
		Bread bread2 = new Bread();
		bread2.name="딸기케잌"; bread2.price=1500;
		bread2.info();
	
	}
	
	
}
