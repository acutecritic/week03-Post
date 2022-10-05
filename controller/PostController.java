package com.sparta.post.controller;


import com.sparta.post.dto.PostDetailDto;
import com.sparta.post.dto.PostReqDto;
import com.sparta.post.dto.PostResDto;
import com.sparta.post.entity.Post;
import com.sparta.post.repository.PostRepository;
import com.sparta.post.sevice.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//@Controller // html
@RestController //json
@RequiredArgsConstructor

@RequestMapping("/api")
public class PostController {

    private final PostRepository postRepository;
    private final PostService postService;

    @GetMapping("/api/posts") //게시글 전체조회
    public List<PostResDto> getAll() {
        return postService.getAll();
    }

    @GetMapping("/api/posts/{id}")  //게시글 하나 조회
    public PostDetailDto getOne(@PathVariable("id") Long id){
        return postService.getOne(id);
    }
    @PostMapping("/api/posts")
    public Post createPost(@RequestBody PostReqDto requestDto){
        Post post = requestDto.toEntity();
        return postRepository.save(post);
    }
}
