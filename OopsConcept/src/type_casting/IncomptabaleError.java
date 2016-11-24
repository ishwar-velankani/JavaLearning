
/*
 * Rule 2
 * A b =(C)d;
 * type of c must be same type of A or child class of A
 */
package type_casting;

public class IncomptabaleError {
	public static void main(String[]args){
		Object o = new String("Durga");
		StringBuffer sb= (StringBuffer)o;
	}

}
