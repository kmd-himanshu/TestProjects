import java.util.ArrayList;


public class GenericTest {
	ArrayList<?> unknownList = new ArrayList<Float>();
	
	ArrayList<? extends Number> numberList = new ArrayList<Number>();
	ArrayList<? extends Number> numberList2 = new ArrayList<Integer>();
	/*numberList = new ArrayList<Float>();
	*/
	public static void main(String[] args) {
		
	}

}
