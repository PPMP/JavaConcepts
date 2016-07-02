public class Coffee {
	public Coffee() {};
	private enum coffeeSize{ small, medium, large}
	coffeeSize size;
//Demonstrating enum
//enum is to limit a variable to have predefined values
	public static void main(String args[]) {
		Coffee myCoffee = new Coffee();
		myCoffee.size = Coffee.coffeeSize.large;
		System.out.println(myCoffee.size);
	}
}
