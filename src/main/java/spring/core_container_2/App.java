package spring.core_container_2;

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
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("/spring/core_container_2/spring_config.xml");
        SamsungPhone sp=(SamsungPhone) ac.getBean("samsung");
        ApplePhone ap=(ApplePhone)ac.getBean("applePhone");
        RedmiPhone rp=(RedmiPhone) ac.getBean("rm");
        sp.cost();
        ap.cost();
        rp.cost();
        sp.processor();
        ap.processor();
        rp.processor();
        ac.close();
    }
}
