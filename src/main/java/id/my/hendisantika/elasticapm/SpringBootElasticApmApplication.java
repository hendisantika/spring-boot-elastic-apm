package id.my.hendisantika.elasticapm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootElasticApmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootElasticApmApplication.class, args);
    }

}
