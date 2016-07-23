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

//Java does not allow multiple inheritence because if a class extends two classes,
//the super class does not know which method to use if the extended classes have
//the same method. Same for abstract class.