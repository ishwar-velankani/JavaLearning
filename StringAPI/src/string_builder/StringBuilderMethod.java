/*
 * all methods are same as string buffer
 * it is not thread safe
 */
package string_builder;

public class StringBuilderMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//append method
		StringBuilder sb=new StringBuilder("Good ");  
		sb.append("mrng");
		System.out.println(sb);//Good mrng
		
		//insert method
		StringBuilder sb1=new StringBuilder("HI ");  
		sb1.insert(1,"Ishwar");
		System.out.println(sb1); 
		
		//replace method
		StringBuilder sb2=new StringBuilder("Good");  
		sb2.replace(1,3,"Excerise");  
		System.out.println(sb2); 
		
		//delete method
		StringBuilder sb3=new StringBuilder("Animal");  
		sb3.delete(1,3);  
		System.out.println(sb3); 
		
		//reverse
		StringBuilder sb4=new StringBuilder("Good");  
		sb4.reverse();  
		System.out.println(sb4);
		
		//capacity method
		StringBuilder sb5=new StringBuilder();  
		System.out.println(sb5.capacity());//default 16  
		

	}

}
