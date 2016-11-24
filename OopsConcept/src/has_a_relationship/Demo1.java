package has_a_relationship;
class Engine{
	int manuf_year;
	//Engine specific methods
}
class Car{
	Engine e = new Engine();//car has a engine reference
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println(c.e.manuf_year);
	}

}
