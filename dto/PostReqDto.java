package com.sparta.post.dto;

import com.sparta.post.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostReqDto {

    private String title;

    private String author;

    private String content;

    private String password;

    // dto를 entity로 바꿔준다
    public Post toEntity(){

        return new Post(title, author, content,password);
    }
}
