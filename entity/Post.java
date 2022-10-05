package com.sparta.post.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Post extends TimeEntity{

    @GeneratedValue(strategy = GenerationType.AUTO)

    @Id
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private String password;



    public Post(String title, String author, String content, String password) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.password = password;
    }

    public void update(String title, String author, String content, String password) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.password = password;

    }

    public boolean isPasswordMatch(String password) {

        return this.password.equals(password);
    }
}
