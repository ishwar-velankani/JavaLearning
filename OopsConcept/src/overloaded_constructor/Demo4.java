/*
 * in case of method there is no problem
 * but in case of constructor if there is any chance of recusion
 * it will show an error
 * Recursive constructor invocation 
 */
package overloaded_constructor;

public class Demo4 {
	Demo4(){
		this(10);
	}
	Demo4(int i){
		this();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
