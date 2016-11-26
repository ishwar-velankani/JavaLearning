/*
 * == operator
 * check reference not value
 */
package string;

public class TestStringComp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ishwar";
		String s2 = "Ishwar";
		String s3 = new String("Ishwar");
		System.out.println(s1 == s2);//true (both refer same value)
		System.out.println(s1 == s2);//false
		
	}

}
