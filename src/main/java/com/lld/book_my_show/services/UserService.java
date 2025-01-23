package com.lld.book_my_show.services;

import com.lld.book_my_show.models.User;
import com.lld.book_my_show.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(String email, String password) {
//        declare custom query in userRepository
        Optional<User> existingUser = userRepository.findByEmail(email);
        if(existingUser.isPresent()){
            throw new RuntimeException("User with this email alreadly exits");
        }

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        return userRepository.save(user);

    }

    public User login(String email, String password) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(()->new RuntimeException("No User Found!!"));

        if(user.getPassword().equals(password)){
            return user;
        }
        throw new RuntimeException("Invalid Credentials!!");
    }

//    STEPS ->
//    1. Check if user already exits
//            a. Fetch the user details by email
//            b. If exists, throw err
//    2. Create a new User
//    3. Save the new User details
//    4. Return the User

}

