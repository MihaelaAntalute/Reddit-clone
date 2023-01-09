package com.example.redditapp.controller;

import com.example.redditapp.DTO.PostRequestDTO;
import com.example.redditapp.DTO.PostResponseDTO;
import com.example.redditapp.model.Post;
import com.example.redditapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/post")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/create")
    public Post addPost(@RequestBody PostRequestDTO postRequestDTO) {
        return postService.addPost(postRequestDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PostResponseDTO>> allPosts(){
        return status(HttpStatus.OK).body(postService.allPosts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostResponseDTO> getPostBy(@PathVariable Long id){
        return status(HttpStatus.OK).body(postService.getPostBy(id));
    }

    @GetMapping("/subreddit/{id}")
    public ResponseEntity<List<PostResponseDTO>> getPostsBySubreddit(@PathVariable Long id){
        return status(HttpStatus.OK).body(postService.getPostsBySubreddit(id));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<PostResponseDTO>> getPostsByUser(@PathVariable Long id){
        return status(HttpStatus.OK).body(postService.getPostsByUser(id));
    }


}
