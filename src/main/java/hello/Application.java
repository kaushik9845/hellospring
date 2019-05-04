package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.apache.log4j.Logger;



@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    static Logger log = Logger.getLogger(Application.class.getName()); 
    public static void main(String[] args) {
        log.info("Inside main method1");
        SpringApplication.run(Application.class, args);
          log.info("Inside main method2");
    }
    
    @Override
    protected SpringApplicationBuilder configure(
      SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
