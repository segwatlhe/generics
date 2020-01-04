package basics;

import java.util.ArrayList;

class GenericClass2<T> {

    private T variable;

    public GenericClass2(T variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "basics.GenericClass [variable=" + variable + "]";
    }

    public T getVariable() {
        return variable;
    }

}

public class App2 {

    private static GenericClass2<Integer> test;

    public static void main(String[] args) {

        System.out.println(new GenericClass2<String>("Some text"));
        System.out.println(new GenericClass2<Double>(2.0));
        System.out.println(new GenericClass2<Character>('#'));

        ArrayList<GenericClass2> list = new ArrayList<>();
        list.add(new GenericClass2(1));
        list.add(new GenericClass2<Integer>(2));
        list.add(new GenericClass2<String>("String"));
        list.add(new GenericClass2<Integer>(4));
        list.add(new GenericClass2<Integer>(5));
        list.add(new GenericClass2<Integer>(6));


        for(GenericClass2 i:list){
            System.out.println("list " + i.getVariable());
        }
    }
}

