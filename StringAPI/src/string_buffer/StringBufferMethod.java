package string_buffer;

public class StringBufferMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public int length();
		StringBuffer sb1 = new StringBuffer("Ishwar");
		System.out.println(sb1.length());
		
		//public int capacity();
		System.out.println(sb1.capacity());
		
		//public char CharAt(int index);
		System.out.println(sb1.charAt(3));
		
		//public void setCharAt(int index,char ch);
		sb1.setCharAt(3, 'x');
		System.out.println(sb1);
		
		
		//public SB append(String s)
		StringBuffer sb = new StringBuffer("Good ");
		sb.append("Morning");
		System.out.println(sb);
		
		//public SB insert(int index,string s)
		sb.insert(5, "Ishwar ");
		System.out.println(sb);
		
		//public SB delete(int begin,int end)
		sb.delete(1,3);
		
		//public SB reverse();
		sb.reverse();
		
		//public void setLength(int length)
		sb.setLength(40);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		//public void ensureCapacity(int Capacity)
		sb.ensureCapacity(10000);
		System.out.println(sb.capacity());
		
		//public void TrimToSize();
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		
		

	}

}
