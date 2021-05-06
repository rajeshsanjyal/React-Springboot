package com.asterisk.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.asterisk.demo.model.User;
import com.asterisk.demo.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private UserRepository urepo;

	@Override
	public void run(String... args) throws Exception {
		this.urepo.save(new User(1, "Ramesh","Shahi","ramesh@test.com"));
		this.urepo.save(new User(2, "Tom","Cat","tom@test.com"));
		this.urepo.save(new User(3, "Ram","Chand","ram@test.com"));
		
	}

}
