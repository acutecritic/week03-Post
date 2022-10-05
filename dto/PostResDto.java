package com.sparta.post.dto;

import com.sparta.post.entity.Post;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
public class PostResDto {

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Long id;

    private String title;

    private String author;

    private String content;

    public PostResDto(Post post){

        createdAt = post.getCreatedAt();

        updatedAt = post.getUpdateAt();

        id = post.getId();

        title = post.getTitle();

        author = post.getAuthor();

    }

}
