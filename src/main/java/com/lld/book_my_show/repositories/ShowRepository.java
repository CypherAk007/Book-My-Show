package com.lld.book_my_show.repositories;

import com.lld.book_my_show.models.MovieShow;
import com.lld.book_my_show.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<MovieShow,Long> {

}
