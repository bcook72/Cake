package baking;

/*This is the peppermint class*/

public class Peppermint extends CakeTopping {
	Cake cake;
	
	public Peppermint (Cake cake) {
		this.cake = cake;
	}
	
	public String getOrder() {
		return cake.getOrder() + " , Peppermint ";
	}
	
	public double cost () {
		return cake.cost() + .33;
	}
}