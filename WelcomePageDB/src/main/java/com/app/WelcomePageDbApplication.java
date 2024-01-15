package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.app.model.User;
import com.app.repositery.UserRepo;



@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories(basePackageClasses = UserRepo.class)
public class WelcomePageDbApplication implements CommandLineRunner {

	@Autowired(required=true)
	private UserRepo repo;
	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(WelcomePageDbApplication.class, args);
		
		
		System.out.println("hota ka nahi");
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
