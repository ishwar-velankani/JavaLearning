/*
 * We create reference of Operation class
 */
package has_a_relationship;
class Operation{
	int square(int n){
		return n*n;
	}
}
public class AggregationDemo {
	Operation op; //making a reference  Aggregation
	double pi =3.14;
	double area(int r){
		op = new Operation();//if we are not writing then 
							//it can lead to null pointer exception
		return pi*op.square(r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationDemo obj = new AggregationDemo();
		System.out.println(obj.area(5));

	}

}
