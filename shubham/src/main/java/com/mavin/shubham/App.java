package com.mavin.shubham;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	/*Vehicle obj=(Vehicle)context.getBean("bike");
    	obj.drive();*/
        Tyre_2 t=(Tyre_2) context.getBean("tyre_2");
        System.out.println(t);
    }
}
	