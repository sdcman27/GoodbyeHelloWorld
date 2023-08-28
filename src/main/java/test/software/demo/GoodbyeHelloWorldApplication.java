package test.software.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoodbyeHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodbyeHelloWorldApplication.class, args);
		System.out.println("GoodbyeHelloWorld");
		System.out.println("Testing 123");
		
	}

}
