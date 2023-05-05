package com.example.authservice;

import com.example.authservice.controllers.AuthController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Collections;

@SpringBootApplication
@Import({AuthController.class})
@EnableJpaRepositories(basePackages = "com.example.authservice.repositories")
public class AuthServiceApplication {
	static final int PORT = 8000;

	@Bean public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AuthServiceApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", PORT));
		app.run(args);
	}

}
