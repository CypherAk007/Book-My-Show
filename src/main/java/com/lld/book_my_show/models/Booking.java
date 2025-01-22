package com.lld.book_my_show.models;



import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    @Enumerated(value = EnumType.STRING)
//    @Enumerated(value = EnumType.ORDINAL)
    private BookingStatus status;

    @ManyToMany
    private List<ShowSeat> showSeats;

    @ManyToOne
    @JoinColumn(name="user")
    private User user;
    private Date time;
    @ManyToOne
    private MovieShow movieShow;
    private double amount;
    @OneToMany
    private List<Payment> payments;
}
