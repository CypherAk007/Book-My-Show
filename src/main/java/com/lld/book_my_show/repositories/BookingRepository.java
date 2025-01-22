package com.lld.book_my_show.repositories;

import com.lld.book_my_show.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
