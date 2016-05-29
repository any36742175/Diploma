package ann.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/* Является контроллером т.е. может обрабатывать url*/
@RestController
@EnableAutoConfiguration
/*говорит контейнеру просканируй пакет в поисках компонент(классов которые должен подхватить контейнер - контроллеры, например)*/
@ComponentScan
public class Main {

    /**
     * При переходе по url-"/" выводит ссылки
     */
    @RequestMapping("/")
    String home() {
        return "<br><a href='/getSemaphores'>/getSemaphores</a></br>" +
                "<br><a href='/index'>/index</a></br>" +
                "<br><a href='/getIPCQueue'>/getIPCQueue</a></br>" +
                "<br><a href='/getChart'>/getChart</a></br>" +
                "<br><a href='/getTerminal'>/getTerminal</a></br>" +
                "<br><a href='/getSharedMemory'>/getSharedMemory</a></br>" +
                "<br><a href='/getChart'>/getChart</a></br>" +
                "<br><a href='/getTCPConnection'>/getTCPConnection</a></br>";
    }

    /**
     * Метод которые говорит контейнеру Spring где лежат jsp
     */
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    /**
     * Стартуем приложение
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

}