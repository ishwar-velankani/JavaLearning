package has_a_relationship;

public class Employee {
	int id;
	String name;
	Address add;
	public Employee(int id,String name,Address add){
		this.id = id;
		this.name=name;
		this.add=add;
	}
	void display(){
		System.out.println(id+" "+name);
		System.out.println(add.city+" "+add.state+" "+add.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1 = new Address("bangalore","Karnataka","India");
		Address add2 = new Address("Chennai","TN","India");
		Employee e1= new Employee(1,"ishwar",add1);
		Employee e2 = new Employee(2,"Sita",add2);
		e1.display();
		e2.display();

	}

}
