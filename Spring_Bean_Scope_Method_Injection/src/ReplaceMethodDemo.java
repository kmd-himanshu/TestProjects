import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReplaceMethodDemo {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Method-Injection.xml");
	
	//Method Replacer
	MobileStore mobileStore = (MobileStore)context.getBean("mobileStore");
	System.out.println(mobileStore.buyMobile());
	
	}
}
