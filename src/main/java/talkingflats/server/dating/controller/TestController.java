package talkingflats.server.dating.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dating/api/v1")
public class TestController {
    
    @GetMapping("/test")
    public String test() {
        return "Найдите мне хобби пжлст";
    }
}
