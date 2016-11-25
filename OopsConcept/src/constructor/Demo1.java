/*
 * constructor is used to initialize the object
 * there are various place we can initialize object
 * 1. Initialization at the definition place
 * 		will lead to same data member to everyone
 * 		public class Demo1 {
			String name="Ishwar";
			int id = 10;
 *	2. instance block
 *		{
 *			Strung name = "ishw"
 *			id = 10;
 *		}//same issue all record will have same value
 *	3.	after creating object
 *		Student s1 = new Student();
 *		s.name="fjsd"
 *		s.id =2
 *		Student s2 = new Student();
 *		s2.name ="hfsjdh"
 *		s2.id = 12;
 *		//results in huge length of code
 *	4. Best way:
 *		using constructor
 */
package constructor;

public class Demo1 {
	String name;
	int id;
	Demo1(String name,int id){
		this.name=name;
		this.id = id;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1= new Demo1("ishwar",12);	//best way to initialize object
		Demo1 d2 = new Demo1("Sristy",1);	//best way to initialize object

	}

}
