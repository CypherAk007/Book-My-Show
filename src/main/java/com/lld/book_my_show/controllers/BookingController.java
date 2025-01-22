package com.lld.book_my_show.controllers;

import com.lld.book_my_show.dtos.BookTicketRequestDto;
import com.lld.book_my_show.dtos.BookTicketResponseDto;
import com.lld.book_my_show.dtos.ResponseStatus;
import com.lld.book_my_show.models.Booking;
import com.lld.book_my_show.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class BookingController {

    private final BookingService bookingService;
    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookTicketResponseDto bookTicket(BookTicketRequestDto requestDto){

        BookTicketResponseDto responseDto = new BookTicketResponseDto();
        try{
            Booking booking = bookingService.bookMovie(requestDto.getShowSeatIds(),requestDto.getShowId(),requestDto.getUserId());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setBookingId(booking.getId());
            responseDto.setAmount(booking.getAmount());
        }catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;

    }
}
