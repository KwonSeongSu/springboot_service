package com.lopic.boot.springboot.web;

import com.lopic.boot.springboot.service.posts.PostsService;
import com.lopic.boot.springboot.web.dto.PostUpdateRequestDto;
import com.lopic.boot.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }
}
