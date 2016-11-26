/*
 * Ways to create string
 * 	creating by using literal
 * 	by new keyword
 */
package string;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="hello";
		char ch[]={'h','e','l','l','o'};
		String s2 = new String(ch);
		String s3 = new String("hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		

	}

}
