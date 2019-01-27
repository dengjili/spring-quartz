package priv.dengjl.spring_quartz.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobOne {
    private static Logger _log = LoggerFactory.getLogger(JobOne.class);

	public  void runJob(){
		_log.debug("任务开始...");
		_log.debug("任务结束 end...");
	}
}
