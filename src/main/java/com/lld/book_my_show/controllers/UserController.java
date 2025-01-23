package com.lld.book_my_show.controllers;

import com.lld.book_my_show.dtos.*;
import com.lld.book_my_show.models.User;
import com.lld.book_my_show.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDto signUp(SignUpRequestDto signUpRequestDto){
        SignUpResponseDto signUpResponseDto = new SignUpResponseDto();
        try{
            User user = userService.signUp(signUpRequestDto.getEmail(),signUpRequestDto.getPassword());
            signUpResponseDto.setStatus(ResponseStatus.SUCCESS);
            signUpResponseDto.setUserId(user.getId());
            signUpResponseDto.setMessage("Sign UP Successful!!");
        } catch (Exception e){
            signUpResponseDto.setStatus(ResponseStatus.FAILURE);
            signUpResponseDto.setMessage(e.getMessage());
        }
        return signUpResponseDto;
    }


    public LoginResponseDto login(LoginRequestDto loginRequestDto){
        LoginResponseDto loginResponseDto = new LoginResponseDto();

        try{
            User user = userService.login(loginRequestDto.getEmail(),loginRequestDto.getPassword());
            loginResponseDto.setStatus(ResponseStatus.SUCCESS);
            loginResponseDto.setUserId(user.getId());
            loginResponseDto.setMessage("Sign UP Successful!!");
        } catch (Exception e){
            loginResponseDto.setStatus(ResponseStatus.FAILURE);
            loginResponseDto.setMessage(e.getMessage());
        }
        return loginResponseDto;
    }
}
