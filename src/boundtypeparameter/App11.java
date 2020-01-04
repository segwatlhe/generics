package boundtypeparameter;

/**
 * There could be a situation where we need the user to enter a specific type of quantity. For such cases we use generics. For example, a method that accepts only String must not be passed with numbers and, therefore, bounded type parameters are used for such purposes.
 *
 * In bounded type parameter, we are bounding or restricting to specific information.
 *
 * In the following code, a restriction is applied to the parameter to pass the only number as an argument. To apply restriction types of display method extends the respective classes Like <E extends Character, N extends Number>
 *
 * Now passing the value other than character and number is not possible.
 * @param <K>
 * @param <V>
 */
class Data11<K extends Integer,V extends App11> {
    private K key;
    private V value;

    public Data11(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString() {
        return "Data11 [key=" + key + ", value=" + value + "]";
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

public class App11 {

    public static void main(String[] args) {
        Data11<Integer,App11> data = new Data11<Integer,App11>(1, new App11());
        data.display('$', 1); // method

    }


}