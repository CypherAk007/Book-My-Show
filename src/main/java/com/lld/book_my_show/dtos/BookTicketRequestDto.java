package com.lld.book_my_show.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookTicketRequestDto {
    private List<Long> showSeatIds;
    private Long userId;
    private Long showId;

}
