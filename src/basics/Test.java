package basics;

import java.util.ArrayList;
import java.util.List;

class MultipleParams <T, U> {

    T obj1;  // An object of type T
    U obj2;

    public MultipleParams(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public U getObj2() {
        return obj2;
    }
}

class GenericClassList <T> {

    private T genericListTypeVariable;

    public GenericClassList(T genericListTypeVariable) {
        this.genericListTypeVariable = genericListTypeVariable;
    }

    public T getGenericListTypeVariable() {
        return genericListTypeVariable;
    }

}

class Account {

    private Object obj;

    // constructor
    public Account(Object obj) {
        this.obj = obj;
    }

    // getter
    public Object getObj() {
        return obj;
    }
}

class User{

    private Object obj;

    // constructor
    public User(Object obj) {
        this.obj = obj;
    }

    // getter
    public Object getObj() {
        return obj;
    }

}

class Contact{

    private Object obj;

    // constructor
    public Contact(Object obj) {
        this.obj = obj;
    }

    // getter
    public Object getObj() {
        return obj;
    }

}

class Address{

    private Object addressId;
    private Object street;
    private Object zip;
    private Integer code;
    private String province;

    public Address(Object addressId, Object street, Object zip, Integer code, String province) {
        this.addressId = addressId;
        this.street = street;
        this.zip = zip;
        this.code = code;
        this.province = province;
    }

    public Object getAddressId() {
        return addressId;
    }

    public Object getStreet() {
        return street;
    }

    public Object getZip() {
        return zip;
    }

    public Integer getCode() {
        return code;
    }

    public String getProvince() {
        return province;
    }
}

public class Test {

   // private static Object MultipleParams;

    public static void main(String[] args) {

        User user = new User("Some User");
        Contact contact = new Contact("Some Contact");
        Account account = new Account("some Account");
        Address address = new Address(1l, "Kruger", 268, 012, "Gauteng");
        Address address1 = new Address(1l, "Kruger", 213, 012, "Gauteng");
        MultipleParams mp = new  MultipleParams<Class, Class>(User.class, Contact.class);

        String userVariable = (String) user.getObj();
        String contactVariable = (String) contact.getObj();
        String accountVariable = (String) account.getObj();

        // address
        Long id = (Long) address.getAddressId();
        String streetName = (String) address.getStreet();
        Integer zip = (Integer) address.getZip();
        Integer zip2 = (Integer) address1.getZip();

        System.out.println(accountVariable);
        System.out.println(userVariable);
        System.out.println("contact...... " + contactVariable);

        System.out.println(" ");


        System.out.println("id: " + id + " street: " + streetName + " zip: " + zip + " code: " + address.getCode()+ " province: " + address.getProvince());

        System.out.println(" ");

        List<GenericClassList> list = new ArrayList<>();
        list.add(new GenericClassList<Integer>(zip));
        list.add(new GenericClassList<Integer>(zip2));
        list.add(new GenericClassList<String>(streetName));
        list.add(new GenericClassList<String>("????"));

        for(GenericClassList i:list){
            System.out.println("list " + i.getGenericListTypeVariable());
        }

        //Test t = new Test();
        Test.genericDisplay(User.class);
    }


    // A Generic method example
    static <T> void genericDisplay (T element)
    {
        System.out.println("  ");
        System.out.println(element.getClass().getSimpleName());
        System.out.println(element);
    }

}
// generics enable stronger type checks at compile time





