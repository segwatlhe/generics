package typeparameters;

/*
 * 
The naming conventions are as follows:
T - Type
E - Element
K - Key
N - Number
V - Value
 * 
 */

	     // Key Value
class Data <K,V> {

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
	
//	@Override
//	public String toString() {
//		return "Data [key=" + key + ", value=" + value + "]";
//	}

	// Element Number
	public <E, N, third> void display(E element, N number, third thirdValue){
		System.out.println("Element: "+element+ " Number: "+number + " third " + thirdValue); // 2.0 + 25
	}
	
}

public class App {

	public static void main(String[] args) {
		                                     // Key Value
		Data<Integer, String> data = new Data<Integer, String>(4, "Chaand");
		
		System.out.println("Key: "+data.getKey()+" value: "+data.getValue()); // 1 + Chaand

		            // Element Number
		data.display("2.0", 25, 555555);
	}

}




