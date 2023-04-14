package it.alessiomaddaluno.artemispoc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;



@Service
public class ArtemisRecieverService {

    private final Logger LOGGER = LoggerFactory.getLogger(ArtemisRecieverService.class);

    @JmsListener(destination = "${jms.queue}")
    public void receiveMessage(String message){
        LOGGER.info("Message received: " + message);
    }
}
