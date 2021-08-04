class Product{
	String name;
	int price;
	
	Product(){}
	Product(String name,int price){
		this.name=name;
		this.price=price;
	}
	Product(String name){
		//this.name=name;
		//this.price=800;
		this(name,800);
	}
	Product(int price){
		this("물",price);
		//this.price=price;
		//this.name="물";
	}
	void print() {
		System.out.println(name+","+price);
	}
}
public class ConEx02 {
	public static void main(String[] args) {
		Product p1=new Product("웰치스",700);
		p1.print();
		Product p2=new Product("커피");
		p2.print();
		Product p3=new Product(500);
		p3.print();
	}
}
