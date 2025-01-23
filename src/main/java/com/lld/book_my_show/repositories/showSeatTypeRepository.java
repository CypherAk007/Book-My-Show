package com.lld.book_my_show.repositories;

import com.lld.book_my_show.models.MovieShow;
import com.lld.book_my_show.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface showSeatTypeRepository extends JpaRepository<ShowSeatType,Long> {
    List<ShowSeatType> findByMovieShow(MovieShow movieShow);
}
