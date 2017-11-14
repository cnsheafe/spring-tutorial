package hello;

import org.joda.time.LocalTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * GreetingController
 */
public class GreetingController {

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "message", defaultValue = "Hello World") String message) {
    return new Greeting(message, new LocalTime());
  }
}
