/**
 * Created by Patorn on 7/22/16.
 */
//public class DiamondProblem extends ClassOne, ClassTwo {
public class DiamondProblem extends ClassOne {
    int age = 21;

    void DisplayAge(){
        System.out.println("Age in DiamondProblem is: " + this.age);
        System.out.println("Age in ClassOne is: " + super.age);
    }
    public static void main(String args[]){
        DiamondProblem diamond = new DiamondProblem();
        diamond.DisplayAge();
    }
}

/** Java does not allow multiple inheritence because if a class extends two classes,
the super class does not know which method to use if the extended classes have
the same method. Same for abstract class. This to access fields and methods in subclass. Super
to access fields and methods of parent class. Superclass reference variable can hold the subclass object, but
 using that variable you can access only the members of the superclass, so to access the members of both classes it
 is recommended to always create reference variable to the subclass. **/