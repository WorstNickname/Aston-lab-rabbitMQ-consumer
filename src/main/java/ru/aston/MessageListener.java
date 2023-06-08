package ru.aston;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static ru.aston.RabbitConfiguration.FIRST_QUEUE_NAME;

@Component
public class MessageListener {

    private final Logger logger = LogManager.getLogger(MessageListener.class);

    @RabbitListener(queues = FIRST_QUEUE_NAME)
    public void listen(CustomMessage message) {
        logger.info(message);
    }

}
