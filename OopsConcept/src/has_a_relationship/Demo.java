/*
 * Explanation of has_a relationship 
 */
package has_a_relationship;
class Student{
	int rollno; //has a relationship
	String name; //has a relationship
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		System.out.println(std.name);
	}

}
