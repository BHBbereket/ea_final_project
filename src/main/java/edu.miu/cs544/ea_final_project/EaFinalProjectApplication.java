package edu.miu.cs544.ea_final_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class EaFinalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EaFinalProjectApplication.class, args);
	}

}
