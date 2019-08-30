package baking;

/*This class is the cake class that is where we created cake, order, and cost.*/

public abstract class Cake {
	String order = "Cake order";
	
	public String getOrder() {
		return order;
	}
	
	public abstract double cost();

}
