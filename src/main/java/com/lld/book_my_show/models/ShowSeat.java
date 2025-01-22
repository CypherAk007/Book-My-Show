package com.lld.book_my_show.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    @ManyToOne
    private MovieShow movieShow;
//    one show seat mapped to single seat
//    one seat can be mapped to multiple show seats
    @ManyToOne
    private Seat seat;

    @Enumerated(value = EnumType.STRING)
    private ShowSeatStatus showSeatStatus;

    private Date blockedAt;
}
