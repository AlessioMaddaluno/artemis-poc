package it.alessiomaddaluno.artemispoc.controller;

import it.alessiomaddaluno.artemispoc.service.ArtemisDispatcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private ArtemisDispatcherService artemisDispatcherService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        this.artemisDispatcherService.sendMessage(message);
        return ResponseEntity.ok("Message sent: " + message);
    }

}
