package com.exam.controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.Role;
import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	@CrossOrigin("*")
	public User createUser(@RequestBody User user) throws Exception {
	
		Role role1 = new Role();
		role1.setRoleId(55L);
		role1.setRoleName("NORMAL");
		
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		
		user.setProfile("defualt.png");
		
		Set<UserRole> userRoleSet = new HashSet<>();
		userRoleSet.add(userRole);
		
		return this.userService.createUser(user, userRoleSet);
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}
	
	@DeleteMapping("/{id}") 
	public void deleteUser(@PathVariable("id") Long userId) {
		this.userService.delete(userId);
	}
}
