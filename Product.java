public class Product
{
	int pcode;
	String pname;
	double price;
	double lowest;
	void data(int c, String n, double p){
		pcode=c;
		pname=n;
		price=p;
	}
	void display(){
		System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	}
	static void findLowest(double price1, double price2, double price3){
	if(price1<=price2 && price1<=price3){
		System.out.println("\n Product 1 is of the lowest price!");
	}
	else if(price2<=price1 && price2<=price3){
		System.out.println("\n Product 2 is of the lowest price!");
	}
	else{
	System.out.println("\n Product 3 is of the lowest price!");
	}
	}
	public static void main(String[] args){
		Product obj1 = new Product();
		Product obj2 = new Product();
		Product obj3 = new Product();
		obj1.data(101, "Product_1", 100.0);
		obj2.data(102, "Product_2", 128.40);
		obj3.data(103, "Product_3", 790.00);
		System.out.println("Product Information: \nProduct_Code\tProduct_Name\tProduct_Price");
		obj1.display();
		obj2.display();
		obj3.display();
		findLowest(obj1.price, obj2.price, obj3.price);
}
}



	