package uk.co.slc.slcjavaspringboottemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


//@EnableConfigurationProperties(YAMLConfig.class)
@SpringBootApplication
public class SlcJavaSpringBootTemplateApplication {


	public static void main(String[] args) {
		SpringApplication.run(SlcJavaSpringBootTemplateApplication.class, args);
	}

}
