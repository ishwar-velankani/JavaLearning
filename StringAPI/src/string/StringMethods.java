package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public char charAt(int index);
		String s1 ="Ishwar";
		System.out.println(s1.charAt(0));
		
		//public int length();
		System.out.println(s1.length());
		
		//public String replace(char oldch,char newch);
		System.out.println(s1.replace('a', 'o'));
		
		//public String toLowerCase();
		System.out.println(s1.toLowerCase());
		
		//public String toUppercase();
		System.out.println(s1.toUpperCase());
		
		//public String trim(); //to remove unnecessary space
		System.out.println(s1.trim());
		
		//public int IndexOf(char ch)
		System.out.println(s1.indexOf('w'));
		
		//public lastIndexOf(char ch);
		System.out.println(s1.lastIndexOf('a'));
		
		//public boolean startsWith(String s);
		System.out.println(s1.startsWith("I"));
		
		//public boolean endsWith(String s);
		System.out.println(s1.endsWith("r"));
		
		//public char valueOf(string s);
		int a = 10;
		String s = String.valueOf(a);
		System.out.println(s+10);
	}

}
