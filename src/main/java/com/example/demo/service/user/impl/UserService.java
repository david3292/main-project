package com.example.demo.service.user.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Role;
import com.example.demo.security.SuperAdmin;

@Service
public class UserService  implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		List<GrantedAuthority> roles = Arrays.asList(new SimpleGrantedAuthority(Role.SUPERADMIN.toString()));
		
		UserDetails user = new User(SuperAdmin.userName, SuperAdmin.password, roles);
		
		return user;
	}

	
	
}
