package com.example.redditapp.controller;

import com.example.redditapp.DTO.VoteRequestDTO;
import com.example.redditapp.model.Vote;
import com.example.redditapp.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/vote")
public class VoteController {
    private VoteService voteService;

    @Autowired
    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @PostMapping("/add")
    public ResponseEntity<Vote> addVote(@RequestBody VoteRequestDTO voteRequestDTO){
        return status(HttpStatus.OK).body(voteService.addVote(voteRequestDTO));
    }

}
