package boundtypeparameter;

/*
There could be a situation where we need the user to enter a specific type of quantity. For such cases we use generics. For example, a method that accepts only String must not be passed with numbers and, therefore, bounded type parameters are used for such purposes.

In bounded type parameter, we are bounding or restricting to specific information.

In the following code, a restriction is applied to the parameter to pass the only number as an argument. To apply restriction types of display method extends the respective classes Like <E extends Character, N extends Number>

Now passing the value other than character and number is not possible.
 */

class Data <K extends Integer,V extends App> {

	private K key;
	private V value;

	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public <E extends Character,N extends Number> void display(E element, N number){
		System.out.println("Element: "+element+" Number: "+number);
	}
	
}

public class App {

	public static void main(String[] args) {
		Data<Integer,App> data = new Data<Integer,App>(5, new App());
		data.display('$', 1);
		data.getValue().test();
        System.out.println("key " + data.getKey());
	}

	public void test() {
		System.out.println("Testing....");
	}

}