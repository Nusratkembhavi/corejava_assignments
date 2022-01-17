package assig2_2;

public class Orders {
	double price;
	
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Orders(double price) {
		super();
		this.price = price;
	}


	@Override
	public String toString() {
		return "Orders [price=" + price + "]";
	}
	
	
	

}