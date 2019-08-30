package baking;

/*This is the fruits class*/

public class Fruit extends CakeTopping {
	Cake cake;
	
	public Fruit (Cake cake) {
		this.cake = cake;
	}
	
	public String getOrder() {
		return cake.getOrder() + " , Fruit ";
	}
	
	public double cost () {
		return cake.cost() + .42;
	}
}