import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class StaticBindingTest {

	public static void main(String args[]) {
		Collection c = new HashSet();
		StaticBindingTest et = new StaticBindingTest();
		et.sort(c);
		
		List list = null;
		et.sort(list);
		
		//String str = null;
		et.sort(null);

	}

	// overloaded method takes Collection argument
	 void sort(Collection c) {
		System.out.println("Inside Collection sort method");
		return;
	}

	// another overloaded method which takes HashSet argument which is sub class
	void sort(HashSet hs) {
		System.out.println("Inside HashSet sort method");
		return;
	}
	
	void sort(ArrayList list){
		System.out.println("Inside Arraylist sort method");
	}
	
	void sort(Object obj){
		System.out.println("Inside Object sort method");
	}
	
	void sort(String str){
		System.out.println("Inside String sort method");
	}
	
	void sort(StringBuffer str){
		System.out.println("Inside String sort method");
	}

}

// Read more:
// http://javarevisited.blogspot.com/2012/03/what-is-static-and-dynamic-binding-in.html#ixzz2Io58AowE