/*
 * Program to understand the concept of freeMemory and totalMemory
 */
package runtime_class;

public class MemoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r= Runtime.getRuntime();
		System.out.println("Free Memory : "+r.freeMemory());
		System.out.println("Total Memory : "+r.totalMemory());
		for(int i=0;i<10000;i++){
			new MemoryTest();
		}
		System.out.println("Free memory after 1000 instances :"+r.freeMemory());
		System.gc();
		System.out.println("Free memory after gc is : "+r.freeMemory());
	}

}
