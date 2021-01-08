package casa;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClaseMain {
	public static ApplicationContext context = null;
	

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("resources/context.xml");
		Casa casa = context.getBean("Casa1", Casa.class);
		
		
		
		
		
		
		System.out.println(casa.toString());
	}

}
