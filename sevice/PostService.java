package com.sparta.post.sevice;


import com.sparta.post.dto.PostDetailDto;
import com.sparta.post.dto.PostResDto;
import com.sparta.post.entity.Post;
import com.sparta.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    //Repository에서 List<Post>로 받아온 데이터들을 List<PostResponseDto> 로 변환시켜준 다음, 리턴한다.
    public List<PostResDto> getAll() {
        List<PostResDto> result = new ArrayList<>();
        List<Post> postList = postRepository.findAllByOrderByModifiedAtDesc();

        for (Post post : postList) {
            PostResDto PostResDto = new PostResDto(post);
            result.add(PostResDto);
        }
        return result;
    }


    public PostDetailDto getOne(Long id) {

        Optional<Post> optionalPost = postRepository.findById(id);

        if (optionalPost.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            return new PostDetailDto(optionalPost.get());
        }
    }
}
