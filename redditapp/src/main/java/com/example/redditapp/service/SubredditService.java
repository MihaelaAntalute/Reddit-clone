package com.example.redditapp.service;

import com.example.redditapp.DTO.SubredditRequestDTO;
import com.example.redditapp.DTO.SubredditResponseDTO;
import com.example.redditapp.mapper.SubredditMapper;
import com.example.redditapp.model.Subreddit;
import com.example.redditapp.repository.SubredditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubredditService {
    private SubredditRepository subredditRepository;

    private SubredditMapper subredditMapper;

    @Autowired
    public SubredditService(SubredditRepository subredditRepository, SubredditMapper subredditMapper) {
        this.subredditRepository = subredditRepository;
        this.subredditMapper = subredditMapper;
    }

    public Subreddit addSubreddit(SubredditRequestDTO subredditRequestDTO) {
        return subredditRepository.save(subredditMapper.mapDtoToSubreddit(subredditRequestDTO));

    }

    public List<SubredditResponseDTO> getAllSubreddits() {
        return subredditRepository.findAll().stream()
                .map(subreddit -> subredditMapper.mapSubredditToDto(subreddit))
                .collect(Collectors.toList());
    }


    public  SubredditResponseDTO getSubreddit(Long subredditId) {
        Subreddit foundSubreddit = subredditRepository.findById(subredditId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "the subreddit was not found"));
        return subredditMapper.mapSubredditToDto(foundSubreddit);
    }


    public void deleteSubreddit(Long subredditId) {
        Subreddit foundSubreddit = subredditRepository.findById(subredditId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "the subreddit was not found"));
        subredditRepository.delete(foundSubreddit);
    }

    public Subreddit findSubredditById(Long subredditId){
       return subredditRepository.findById(subredditId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "the subreddit was not found"));
    }

}
