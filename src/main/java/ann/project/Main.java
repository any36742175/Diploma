package ann.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@RestController
@EnableAutoConfiguration
//@ComponentScan(basePackages = "ann.project")
@ComponentScan
public class Main {


    @RequestMapping("/")
    String home() {
        return "<br><a href='/getSemaphores'>/getSemaphores</a></br>" +
             "<br><a href='/index'>/index</a></br>" +
             "<br><a href='/getIPCQueue'>/getIPCQueue</a></br>" +
             "<br><a href='/getTerminal'>/getTerminal</a></br>" +
                "<br><a href='/getSharedMemory'>/getSharedMemory</a></br>" +
                "<br><a href='/getTCPConnectionChart'>/getTCPConnectionChart</a></br>" +
                "<br><a href='/getTCPConnection'>/getTCPConnection</a></br>";
    }

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

}