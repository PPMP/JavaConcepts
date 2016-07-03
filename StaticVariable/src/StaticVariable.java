//static/class variables - one copy per object per class. Can change
//public static final - constant. Cannot be changed once initialized
public class StaticVariable {
	public static int numberOne;
	public static final int CONSTANTNUMBER = 9;
	
	public static void main(String args[]){
		numberOne = 1;
		numberOne = 10;
		StaticVariable.numberOne = 1;
		
		//CONSTANTNUMBER = 10;Value cannot be changed when initialized
	}
}
