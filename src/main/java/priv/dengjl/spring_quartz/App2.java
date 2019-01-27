package priv.dengjl.spring_quartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args ) throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("quartz-context.xml");
        /*SchedulerFactoryBean schedulerFactory = context.getBean(SchedulerFactoryBean.class);
        schedulerFactory.getScheduler().start();*/
    }
}
