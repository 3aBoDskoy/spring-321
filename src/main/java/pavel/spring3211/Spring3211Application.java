package pavel.spring3211;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Spring3211Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring3211Application.class, args);
	}

}
