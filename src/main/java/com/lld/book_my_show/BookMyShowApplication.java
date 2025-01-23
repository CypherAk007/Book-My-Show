package com.lld.book_my_show;

import com.lld.book_my_show.controllers.UserController;
import com.lld.book_my_show.dtos.SignUpRequestDto;
import com.lld.book_my_show.dtos.SignUpResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {

	private final UserController userController;
	@Autowired
    public BookMyShowApplication(UserController userController) {
        this.userController = userController;
    }


    public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SignUpRequestDto signUpRequestDto = new SignUpRequestDto();
		signUpRequestDto.setEmail("abhishekktm007@gmail.com");
		signUpRequestDto.setPassword("12345678");
		SignUpResponseDto responseDto = userController.signUp(signUpRequestDto);
		System.out.println(responseDto);
	}
}
