package Package.Two;

import Package.One.ClassOne;
	
public class ClassThree extends ClassOne{
	public static void main(String args[]){
	ClassThree three = new ClassThree();
	three.age = 11;
	ClassOne one = new ClassOne();
	one.height = 10;
	}
}
