class Product{
	private String name;
	private int price;
 public void setName(String new_name) {
	 name= new_name;
 }
 public String getName() {
	 return name;
 }
 public void setPrice(int new_price) {
	 price= new_price;
 }
 public int getPrice() {
	 return price;
 }
}

public class Ex6_01 {

	public static void main(String[] args) {
		Product p = new Product();
		p.setName("커피");
		p.setPrice(150);
		System.out.println(p.getName()+" "+p.getPrice()+"원");
		p.setName("비타500");
		p.setPrice(500);
		System.out.println(p.getName()+" "+p.getPrice()+"원");
	}

}
