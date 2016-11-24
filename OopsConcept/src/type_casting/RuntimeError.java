
/*
 * Rule 3
 * A b =(C)d;
 * underlying object type of d must be same or derived type of c
 */
package type_casting;

public class RuntimeError {
	public static void main(String[]args){
		Object o = new String("Durga");
		StringBuffer sb= (StringBuffer)o;
	}

}
