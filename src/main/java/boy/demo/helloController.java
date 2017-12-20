package boy.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(){
        return "hello github,let's snowboarding!!!";
    }


}

