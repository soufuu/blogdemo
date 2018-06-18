package com.sofuu.blogdemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString

@Entity
@Table(name = "t_blog")
public class Blog {

    public Blog(){}

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String firstPic;
    private String flag;
    private Integer views;
    private boolean donataFlag;
    private boolean copyrightFlag;
    private boolean commentableFlag;
    private boolean publishFlag;
    private boolean reconmmendFlag;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;


    @ManyToOne
    private Category category;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Tag> tags = new ArrayList<>();

    @ManyToOne
    User user;

    @OneToMany(mappedBy = "blog")
    List<Comment> comments = new ArrayList<>();
}
