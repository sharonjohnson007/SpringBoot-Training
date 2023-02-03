package com.project.springsecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Class PasswordGenerator encodes the rawPassword.
 */
public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "johnson123";
        String encodedPassword = bCryptPasswordEncoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }
}
