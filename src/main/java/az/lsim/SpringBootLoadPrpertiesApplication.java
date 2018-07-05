package az.lsim;

import az.lsim.ConfigurationProperties.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableConfigurationProperties(Config.class)
public class SpringBootLoadPrpertiesApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringBootLoadPrpertiesApplication.class);
		springApplication.setAddCommandLineProperties(false);  // it will disable command like option, when set false then it will ignore command line option.
		springApplication.run(args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void init(){
		System.out.println("Application ready event");

		System.out.println("## @ConfigurationProprties ##");
		System.out.println(Config.getAnnotation());
		System.out.println(Config.getMyarray()[0]);
		System.out.println(Config.isLogical());
		System.out.println(Config.getNumericint());
		System.out.println(Config.getNumericlong());
		System.out.println(Config.getNumericdouble());
		System.out.println(Config.getNumericintarray());

	}
}
