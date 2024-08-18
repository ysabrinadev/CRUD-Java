package com.crudjava.crud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.crudjava.crud.entities.User;
import com.crudjava.crud.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Himmel", "himmel@gmail.com", "1234", "The hero.");
		User u2 = new User(null, "Frieren", "frieren@gmail.com", "1234", "The mage.");
		User u3 = new User(null, "Heiter", "heither@gmail.com", "1234", "The cleric.");
		User u4 = new User(null, "Eisen", "eisen@gmail.com", "1234", "The warrior.");

		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));

	}

}
