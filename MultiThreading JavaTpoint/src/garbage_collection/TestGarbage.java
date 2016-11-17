package garbage_collection;

public class TestGarbage {
	public void finalize(){
		System.out.println("Object is collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGarbage t1 = new TestGarbage();
		TestGarbage t2 = new TestGarbage();
		t1 = null;
		t2 = null;
		System.gc();

	}

}
