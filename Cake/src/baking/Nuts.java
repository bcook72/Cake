package baking;

/*This is the nuts class*/

public class Nuts extends CakeTopping {
	Cake cake;
	
	public Nuts (Cake cake) {
		this.cake = cake;
	}
	
	public String getOrder() {
		return cake.getOrder() + " , Nuts ";
	}
	
	public double cost () {
		return cake.cost() + .55;
	}
}