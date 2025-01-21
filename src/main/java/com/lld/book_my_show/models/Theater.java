package com.lld.book_my_show.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theater extends BaseModel{
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
//    above annot tells that until we dont call theater.getRegion()
//    dont load the obj
    @JoinColumn(name = "region")
    private Region region;

    @OneToMany
    private List<Screen> screens;

}
