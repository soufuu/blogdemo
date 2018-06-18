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
@Table(name = "t_tags")
public class Tag {

    @Id
    @GeneratedValue
    private Long id;
    private String name;


    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();
}
