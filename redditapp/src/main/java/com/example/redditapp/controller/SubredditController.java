package com.example.redditapp.controller;

import com.example.redditapp.DTO.SubredditRequestDTO;
import com.example.redditapp.DTO.SubredditResponseDTO;
import com.example.redditapp.model.Subreddit;
import com.example.redditapp.service.SubredditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/subreddit")
public class SubredditController {
    private SubredditService subredditService;

    @Autowired
    public SubredditController(SubredditService subredditService) {
        this.subredditService = subredditService;
    }

    @PostMapping("/create")
    public ResponseEntity<Subreddit> addSubreddit(@RequestBody SubredditRequestDTO subredditRequestDTO) {
        return status(HttpStatus.OK).body(subredditService.addSubreddit(subredditRequestDTO));
    }


    @GetMapping("/all")
    public ResponseEntity<List<SubredditResponseDTO>> getAllSubreddits() {
        return status(HttpStatus.OK).body(subredditService.getAllSubreddits());
    }

    @GetMapping("/{subredditId}")
    public  SubredditResponseDTO getSubredditById(@PathVariable Long subredditId) {
        return subredditService.getSubreddit(subredditId);
    }


    @GetMapping("/{postId}")
    public ResponseEntity<SubredditResponseDTO> getSubreddit(@PathVariable Long postId){
        return status(HttpStatus.OK).body(subredditService.getSubreddit(postId));
    }


    @DeleteMapping("/delete/{subredditId}")
    public void deleteSubreddit(@PathVariable Long subredditId) {
        subredditService.deleteSubreddit(subredditId);
    }


}
