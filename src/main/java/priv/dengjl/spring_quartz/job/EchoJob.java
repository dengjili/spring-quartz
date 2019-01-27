package priv.dengjl.spring_quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by it
 * Created in 2019年1月27日
 * Description: QuartzJobBean是spring-context-support中的类
 */
public class EchoJob extends QuartzJobBean{
	
    private static Logger _log = LoggerFactory.getLogger(EchoJob.class);

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		_log.info("spring-quartz例子");
		_log.info("参数：{}", context.getJobDetail().getJobDataMap().getString("param"));
	}
}
