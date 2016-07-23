/**
 * Created by Patorn on 7/22/16.
 */

public class TestInterface implements InterfaceOne, InterfaceTwo {

    @Override //when overriding you must increase visibility only
    public void Display(){
        System.out.println("Display");
    }

    public void Displaytwo(){
        System.out.println("Displaytwo");
    }

    public static void main(String args[]){
        TestInterface test = new TestInterface();
        test.Display();
        test.Displaytwo();
    }
}

/**Class can implement multiple interfaces. If interfaces has same method. You have to override the function
and the compiler will be okay and treat the methods as one. When overriding functions, you must increase
 visibility, not lower visibility. Interfaces are default public and variables are public static final.
 Which means variable is a constant and is also independent of the instances of the class. So when you
 try to implement (override) you must have same or higher visibility in the overrided function. An interface
 extended by another interface can happen. The class that implements the class would have to implement
 all methods in both interfaces**/

