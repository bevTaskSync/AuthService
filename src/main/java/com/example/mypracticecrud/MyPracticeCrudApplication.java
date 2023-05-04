package com.example.mypracticecrud;

import com.example.mypracticecrud.controllers.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Collections;

@SpringBootApplication
@Import({BookController.class})
@EnableJpaRepositories(basePackages = "com.example.mypracticecrud.repositories")
public class MyPracticeCrudApplication {
	static final int PORT = 8000;
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MyPracticeCrudApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", PORT));
		app.run(args);
	}

}
