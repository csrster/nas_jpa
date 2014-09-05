package dk.netarkivet;

import dk.netarkivet.ws.ConfigRestService;
import dk.netarkivet.ws.ConfigPwService;
import dk.netarkivet.ws.RsApplication;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.ws.rs.ext.RuntimeDelegate;
import java.util.Arrays;


@Configuration
@EnableAutoConfiguration
@ImportResource("classpath:context.xml")
public class Main{

    @Bean
    public ConfigPwService configPwService() {
        return new ConfigPwService();
    }

    @Bean( destroyMethod = "shutdown" )
    public SpringBus cxf() {
        return new SpringBus();
    }

    @Bean
    public Server jaxRsServer() {
        JAXRSServerFactoryBean factory = RuntimeDelegate.getInstance().createEndpoint( rsApplication(), JAXRSServerFactoryBean.class );
        factory.setServiceBeans( Arrays.< Object >asList(configRestService()) );
        factory.setAddress( "/" + factory.getAddress() );
        factory.setProviders( Arrays.< Object >asList( jsonProvider() ) );
        return factory.create();
    }

    @Bean
    public ConfigRestService configRestService() {
        return new ConfigRestService();
    }

    @Bean
    public JacksonJsonProvider jsonProvider() {
        return new JacksonJsonProvider();
    }

    @Bean
    public RsApplication rsApplication()  {
        return new RsApplication();
    }
}
