/*
 * Approach 2:
 * 	we don't create any object in starting
 * 	inside method we check whether object is created or not
 */
package singleton_class;

public class Demo3 {
	public static Demo3 d = null;
	private Demo3(){
		
	}
	public static Demo3 getObject(){
		if(d==null)
			d=new Demo3();
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d1 = Demo3.getObject();
		Demo3 d2 = Demo3.getObject();
	}

}
