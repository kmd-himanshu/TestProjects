public class TestStr {
	public static void main(String[] args) {
		String a = "abc";
		System.out.println(a.hashCode());
		a = "xyz";
		System.out.println(a.hashCode());
		
		String b= "abc";
		System.out.println(b.hashCode());
		
		System.out.println(a);
	}
}
