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
@Table(name = "t_comment")
public class Comment {
    Comment(){};
    @Id
    @GeneratedValue
    private Long id;
    private String nickName;
    private String content;
    private String email;
    private String avatar;


    @OneToMany(mappedBy = "parentComment")
    private List<Comment> replyComment = new ArrayList<>();

    @ManyToOne
    private  Comment parentComment;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @ManyToOne
    private Blog blog;

}
