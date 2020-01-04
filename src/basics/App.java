package basics;

class Data{
    private Object obj;

    // constructor
    public Data(Object obj) {
        this.obj = obj;
    }

    // getter
    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "basics.Data [obj=" + obj + "]";
    }
}

class GenericClass<T>{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "basics.GenericClass [data=" + data + "]";
    }

}

public class App {

    public static void main(String[] args) {

        Data data = new Data("Some String");

        String variable = (String) data.getObj();
        System.out.println(variable);


		/*
		basics.GenericClass<String> genericData = new basics.GenericClass<String>("Some data");
		String data = genericData.getData();
		System.out.println(data);
		*/


    }

}






