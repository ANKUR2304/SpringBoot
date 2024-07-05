package dependencyInjectionWithSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	
    	Laptop laptop = (Laptop) appContext.getBean("laptop");
    	laptop.display();
    }
}
