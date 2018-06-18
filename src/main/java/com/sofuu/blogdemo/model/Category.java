package com.sofuu.blogdemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString

@Entity
@Table(name="t_category")
public class Category {
    public Category(){};

    @Id
    @GeneratedValue
    private Long id;
    private  String name;


    @OneToMany(mappedBy = "category")
    private List<Blog> blogs = new ArrayList<>();

}
