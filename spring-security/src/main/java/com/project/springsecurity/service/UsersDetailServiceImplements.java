package com.project.springsecurity.service;

import com.project.springsecurity.model.Users;
import com.project.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public class UsersDetailServiceImplements implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Users users = userRepository.getUsersByUserName(userName);
        if (users == null) {
            throw new UsernameNotFoundException("User not exist with name" + userName);
        }
        return new MyUserDetails(users);
    }
}
