package baking;

/*This is the orders class*/

public class Orders {

	public static void main(String[] args) {
		Cake cake = new Cheesecake();
		System.out.println(cake.getOrder()
			+ " $" + cake.cost());
	
	Cake cake2 = new Chocolate();
	cake2 = new Fruit (cake2);
	cake2 = new Nuts(cake2);
	System.out.println(cake2.getOrder()
			+ " $" + cake2.cost());
	
	Cake cake3 = new Angel();
	cake3 = new Sprinkles(cake3);
	cake3 = new Peppermint(cake3);
	System.out.println(cake3.getOrder()
			+ " $" + cake3.cost());
	}
}