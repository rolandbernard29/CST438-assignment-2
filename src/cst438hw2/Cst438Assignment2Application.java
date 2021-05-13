package cst438hw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"cst438hw2.controller", "cst438hw2.service", "cst438hw2.domain"})
public class Cst438Assignment2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cst438Assignment2Application.class, args);
	}

}
