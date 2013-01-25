import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LookupMethodDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Method-Injection.xml");
		
		//Look up Method
		BookStore book = (BookStore)context.getBean("book");
		
		System.out.println(book.orderBook().bookTitle());
	}
}
