package com.lld.book_my_show.services;

import com.lld.book_my_show.models.MovieShow;
import com.lld.book_my_show.models.ShowSeat;
import com.lld.book_my_show.models.ShowSeatType;
import com.lld.book_my_show.repositories.showSeatTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculatorService {

    private  showSeatTypeRepository showSeatTypeRepository;

    @Autowired
    public PriceCalculatorService(com.lld.book_my_show.repositories.showSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }

    public double calculate(MovieShow movieShow, List<ShowSeat> savedShowSeats) {
        List<ShowSeatType> showSeatTypes = showSeatTypeRepository.findAllbyMovieShow(movieShow);
        double amount = 0;
        for(ShowSeat showSeat: savedShowSeats ){
            for(ShowSeatType showSeatType:showSeatTypes){
                if(showSeat.getSeat().getSeatType().equals(showSeatType.getSeatType())){
                    amount+=showSeatType.getPrice();
                }
            }
        }
        return amount;
    }
}
