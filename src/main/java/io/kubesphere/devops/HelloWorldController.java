package io.kubesphere.devops;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Hello world!
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {

     @RequestMapping(value = "/", method = RequestMethod.GET)  
    public String sayHello() {
        return "Really appreciate your star, that's the power of our life.";
    }
}
