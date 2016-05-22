package ann.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = "ann.project")
public class Main {

    @RequestMapping("/home")
    String home() {
        return "home";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

}