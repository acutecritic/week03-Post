package com.sparta.post.dto;

import com.sparta.post.entity.Post;

import java.time.LocalDateTime;


public class PostDetailDto {

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Long id;

    private String title;

    private String author;

    private String content;

    public PostDetailDto(Post post){

        createdAt = post.getCreatedAt();

        updatedAt = post.getUpdateAt();

        id = post.getId();

        title = post.getTitle();

        author = post.getAuthor();

        content = post.getContent();
    }

}
