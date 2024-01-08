package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.model.User;
import com.app.repositery.UserRepo;



@SpringBootApplication
public class WelcomePageDbApplication implements CommandLineRunner {

	@Autowired(required=true)
	private UserRepo repo;
	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(WelcomePageDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new User(12,"Sunil"));
		repo.save(new User(13,"Sagar"));
		repo.save(new User(14,"Stuti"));
		repo.save(new User(15,"Shital"));
		repo.save(new User(16,"Meerabhi"));
	}

}
