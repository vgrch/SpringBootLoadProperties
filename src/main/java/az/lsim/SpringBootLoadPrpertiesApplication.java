package az.lsim;

import az.lsim.ConfigurationProperties.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

import javax.sql.DataSource;

@SpringBootApplication
@EnableConfigurationProperties(Config.class)
public class SpringBootLoadPrpertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLoadPrpertiesApplication.class, args);
    }

    @Bean(destroyMethod = "")
    @ConfigurationProperties("app.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
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
