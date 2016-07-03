
public class Arrays {
//Different ways to use array
	public static int[] doNothing(int[] array){
		return array;
	}
	public static void main(String args[]){
		int[] integer = {1,2,3};
		int[] integerTwo = new int[]{1,2,3};
		int[] integerThree = new int[2];
		
		int[] holder = doNothing(integer);
		
		for(int i : integerTwo){
			System.out.println(i);
		}
		
		for(int i : holder){
			System.out.println(i);
		}
		
	}
}
