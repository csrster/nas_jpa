package dk.netarkivet.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class Main{


    /*public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Main.class);
        springApplication.setWebEnvironment(false);
        ConfigurableApplicationContext context = springApplication.run();
        ConfigPasswordsDao dao = context.getBean(ConfigPasswordsDao.class);
    }*/


}
