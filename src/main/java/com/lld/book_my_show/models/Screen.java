package com.lld.book_my_show.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Screen extends BaseModel{
    private String name;
    @OneToMany
    private List<Seat> seats;

    @Enumerated(value = EnumType.STRING)
//    @ManyToMany - as db we cant store multiple val in one col
//    so we use element collection to store list feature
    @ElementCollection
    private List<Feature> features;

}
