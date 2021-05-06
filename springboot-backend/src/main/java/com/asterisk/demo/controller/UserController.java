package com.asterisk.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asterisk.demo.model.User;
import com.asterisk.demo.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {
	@Autowired
	private UserRepository urepo;
	@GetMapping("users")
	public List<User> getUsers(){
		return this.urepo.findAll();
	}
}
