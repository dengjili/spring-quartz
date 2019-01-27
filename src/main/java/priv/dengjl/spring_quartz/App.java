package priv.dengjl.spring_quartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * Created by it
 * Created in 2019年1月27日
 * Description: bean方式
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SchedulerFactoryBean schedulerFactory = context.getBean(SchedulerFactoryBean.class);
        schedulerFactory.getScheduler().start();
    }
}
