package test.software.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoodbyeHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodbyeHelloWorldApplication.class, args);
		System.out.println("GoodbyeHelloWorld");
		System.out.println("Testing 12345");
		System.out.println("Testing 6789");
		System.out.println("This is a test that we are testing");
		System.out.println("This is another test that we are testing");
		
		System.out.println("This is a change that we are changing");
		
	}

}
