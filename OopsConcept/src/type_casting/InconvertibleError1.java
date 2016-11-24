/*
 * 
 * Rule 1
 * A a = (C)d;
 * type of d and c must be have relation 
 * P-C, C-C same type
 * 
 */
package type_casting;

public class InconvertibleError1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Durga");
		StringBuffer sb = (StringBuffer)s;
	}

}
