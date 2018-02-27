package yudi;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationUpdaterController {

    @MessageMapping("/sendMessage")
    @SendTo("/queue/vehicles")
    public String sendMessage(String message) throws Exception {
        return message;
    }
}
