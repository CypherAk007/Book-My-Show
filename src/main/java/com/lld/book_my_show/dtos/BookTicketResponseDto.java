package com.lld.book_my_show.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDto {
    private ResponseStatus responseStatus;
    private Long bookingId;
    private double amount;

}
