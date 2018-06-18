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
@Table(name = "t_user")
public class User {
    User(){}

    @Id
    @GeneratedValue
    private Long id;
    private String nickName;
    private String userName;
    private String password;
    private String email;
    private Integer type;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @OneToMany(mappedBy = "user")
    List<Blog> blogs = new ArrayList<>();
}
