package immutable_class;

final public class Demo2 {
	private int i;
	Demo2(int i){
		this.i = i;
	}
	public Demo2 modify(int i){
		if(this.i==i)
			return this;
		else
			return (new Demo2 (i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 t1 = new Demo2(10);
		Demo2 t2 = t1.modify(100);
		Demo2 t3 = t1.modify(10);
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
	}

}
