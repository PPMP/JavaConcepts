/*Demonstrating inner classes
InnerClass can be static - makes it stand alone class
can instantiate by calling constructor directly. Static/Non Static classes and methods 
can access static fields. However, static methods cannot access non static fields directly 
unless the class is instantiated so the newly created object can access the non static
field.Static means independent of instances of class.
Inner class can access instance variables and methods of super class
Super class has access to Inner class with instantiation and initialization of inner
classes constructor*/
public class OuterClass {
	private int age = 99;
	private static int coolPoints = 100;
	public OuterClass(){
		System.out.println("Hello");
		InnerClass inner = new InnerClass();
		System.out.println(inner.cool);
	}
	
	private void lol(){
		System.out.println("Non static method printing static variable" + coolPoints);
	}
	
	private static void print(){
		System.out.println("Static method printing static variable: " + coolPoints);
	}
	
	private class InnerClass{
		private int cool = 9;
		public InnerClass(){
			System.out.println("Hello its me inner class " + age);
			lol();
			print();
		}
	}

	public static void main(String args[]){
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
	
	}
}
