package com.lld.book_my_show.dtos;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignUpResponseDto {
    private ResponseStatus status;
    private Long userId;
    private String message;
}
