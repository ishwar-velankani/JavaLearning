/*
 * Create Sington class
 * Approach 1:
 * 	runtime class is implemented by this way
 */
package singleton_class;

public class Demo2 {
	private static Demo2 d = new Demo2(); //object created
	private Demo2(){		//Private constructor so outside can't create any object
		
	}
	public static Demo2 getObject(){	//method to return reference 
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1 = Demo2.getObject();
		Demo2 d2 = Demo2.getObject();

	}

}
