package basics2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data <T> {
	private T myVariable;

	public Data(T myVariable) {
		super();
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}
	
}

public class App {

	public static void main(String[] args) {

		// List type of Integer
		List < Data<Integer> > elements = new LinkedList<>();
		elements.add(new Data<Integer>(1));
		elements.add(new Data<Integer>(2));
		elements.add(new Data<Integer>(3));
		elements.add(new Data<Integer>(4));
		elements.add(new Data<Integer>(5));
		elements.add(new Data<Integer>(6));
		
		App app = new App();

		// list type passed as parameter
		app.printList(elements);
	}

	// argument is of list type
	void printList(List <Data<Integer>> list) {
		ListIterator<Data<Integer>> iterator = list.listIterator();

		for(Data<Integer> i: list){
			System.out.println("Element: " + i.getMyVariable()*10);
		}

//		while (iterator.hasNext()) {
//			System.out.println("Element: " + iterator.next().getMyVariable() * 10);
//		}
	}

}