package baking;

/*This is the sprinkles class*/

public class Sprinkles extends CakeTopping {
	Cake cake;
	
	public Sprinkles (Cake cake) {
		this.cake = cake;
	}
	
	public String getOrder() {
		return cake.getOrder() + " , Sprinkles ";
	}
	
	public double cost () {
		return cake.cost() + .78;
	}
}