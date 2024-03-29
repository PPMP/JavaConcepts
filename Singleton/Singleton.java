public class Singleton {
	//Class that allows only one instance
	private static Singleton singleton = new Singleton();
	   
	   /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	   private Singleton(){ }
	   
	   //return singleton
	   public static Singleton getInstance() {
	      return singleton;
	   }

    public static void main(String[] args) {
    	Singleton first = new Singleton();
    	Singleton second = Singleton.getInstance(); //will reference the same instance created
    }
}