/*
 * in earlier version than 1.4 same return type
 * but now co variant return type
 * co variant : applicable only for objct type
 * 				no for primitive type
 */
package overriding;
class X{
	public Object m1(){
		return null;
	}
}
class Y extends X{
	public String m1(){
		return null;
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
