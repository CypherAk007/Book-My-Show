package com.lld.book_my_show.repositories;

import com.lld.book_my_show.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//https://docs.spring.io/spring-data/jpa/reference/repositories/query-methods-details.html
//https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

//    Select * from user where email = 'given email'  - internal query of below declaration
    Optional<User> findByEmail(String email);

//    if we want to pass multiple parameters
//    Optional<User> findByIdAndEmail(@Param("email") String email,@Param("id") Long id);

    //    if we want to find by email and password
//    Optional<User> findByEmailAndEmail(String email,String password);

}
