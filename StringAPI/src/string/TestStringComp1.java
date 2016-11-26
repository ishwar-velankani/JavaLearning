/*
 * public boolean equals(Object another)
 * public boolean equalsIgnoreCase(String another)
 */
package string;

public class TestStringComp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ishwar";
		String s2 = "Ishwar";
		String s3 = new String("Ishwar");
		String s4 = "Sauraw";
		String s5 = "ishwar";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		System.out.println(s1.equalsIgnoreCase(s5));//true
		
	}

}
