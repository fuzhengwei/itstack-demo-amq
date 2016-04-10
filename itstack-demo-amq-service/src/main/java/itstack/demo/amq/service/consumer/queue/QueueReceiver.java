
package itstack.demo.amq.service.consumer.queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description  队列消息监听器
 */
@Service("queueReceiver")
public class QueueReceiver implements MessageListener {

	private Logger logger = LoggerFactory.getLogger(QueueReceiver.class);

	@Override
	public void onMessage(Message message) {
		try {
			logger.info("QueueReceiver接收到消息:{}",((TextMessage)message).getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
