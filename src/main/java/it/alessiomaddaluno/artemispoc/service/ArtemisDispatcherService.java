package it.alessiomaddaluno.artemispoc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ArtemisDispatcherService {

    private final Logger LOGGER = LoggerFactory.getLogger(ArtemisDispatcherService.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${jms.queue}")
    private String jmsQueue;

    public void sendMessage(String message){
        this.jmsTemplate.convertAndSend(jmsQueue,message);
    }

}
