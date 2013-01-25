import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Method-Injection.xml");
		for(int i =0; i<10; i++){
		Student student =(Student)context.getBean("student");
		System.out.println(student.getCount());
		}
	}
}
