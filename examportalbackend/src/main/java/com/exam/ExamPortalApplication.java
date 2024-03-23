package com.exam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.entity.UserRole;
import com.exam.service.UserService;
import com.exam.entity.Role;
import com.exam.entity.User;

@SpringBootApplication
public class ExamPortalApplication implements CommandLineRunner{

	@Autowired
	private UserService userservice;
	
	private User user;

	public static void main(String[] args)  {
		SpringApplication.run(ExamPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println("starting code running");
//		User user = new User();
//		user.setFirstName("Sajal");
//		user.setEmail("sajal@gmail.com");
//		user.setEnabled(true);
//		user.setLastName("Saxena");
//		user.setPassword("1234");
//		user.setUsername("Admin");
//		
//		Role role1 = new Role();
//		role1.setRoleName("ADMIN");
//		role1.setRoleId(44L);
//		
//		Set<UserRole> user_role_set = new HashSet<>();
//		UserRole usr_role = new UserRole();
//		usr_role.setRole(role1);
//		usr_role.setUser(user);
//		user_role_set.add(usr_role);
//		
//		User user1 = this.userservice.createUser(user, user_role_set);
//		System.out.println(user1.getUsername());
		
	}
}
