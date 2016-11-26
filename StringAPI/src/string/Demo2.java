/*
 * Immutable String
 * 	Can't be changed once object is created
 * 	but a new object can be created
 */
package string;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("hello");
		s1.concat("Ishwar"); //it wont change s1 value 
							//just create new object
		System.out.println(s1);//hello
		
		//if we want explicitly we can change
		String s2 = "Good";
		s2 =s2.concat(" Morning");//Explicit assignment
		System.out.println(s2);
	}

}
