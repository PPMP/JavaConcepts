//demonstrating one copy for each instance of a class 
public class ClassVariables {
	private static int height;
	
	public static void main(String args[]){
		height = 10;
		ClassVariables one = new ClassVariables();
		ClassVariables two = new ClassVariables();
		System.out.println(two.height);
		System.out.println(one.height);
	}
}
