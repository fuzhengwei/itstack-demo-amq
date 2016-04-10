package itstack.demo.amq.service.consumer.topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * @description Topic消息监听器
 */
@Service("topicReceiver")
public class TopicReceiver implements MessageListener {

    private Logger logger = LoggerFactory.getLogger(TopicReceiver.class);

    @Override
    public void onMessage(Message message) {
        try {
            logger.info("TopicReceiver接收到消息:{}", ((TextMessage) message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
