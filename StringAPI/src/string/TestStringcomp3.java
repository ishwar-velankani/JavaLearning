package string;

public class TestStringcomp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ishwar";
		String s2 = "Kumar";
		String s3 = "Ishwar";
		System.out.println(s1.compareTo(s2)); //-2
		System.out.println(s2.compareTo(s1)); //2
		System.out.println(s1.compareTo(s3)); //0
		System.out.println(s1.compareTo(s1)); //0

	}

}
