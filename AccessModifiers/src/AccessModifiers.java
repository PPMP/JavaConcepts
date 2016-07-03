
public class AccessModifiers {
	int age; //package private
	private int ageTwo; //cannot be accessed by class test
	protected int ageThree; //can be inherited and accessed 
	public static void lol(){}; //can be called without creating obj
}

class test {
	public static void main(String args[]){
	/* can be used in class test because AccessModifier is public */
	AccessModifiers man = new AccessModifiers(); 
	man.age = 10;
	}
}