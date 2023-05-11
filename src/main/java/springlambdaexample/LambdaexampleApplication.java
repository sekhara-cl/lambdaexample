package springlambdaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springlambdaexample.model.User;

import java.util.List;

@SpringBootApplication
public class LambdaexampleApplication {
	@Bean
	public String getUser() {
		return "vijay kaumaa";
	}

	public static void main(String[] args) {
		SpringApplication.run(LambdaexampleApplication.class, args);
	}

}
