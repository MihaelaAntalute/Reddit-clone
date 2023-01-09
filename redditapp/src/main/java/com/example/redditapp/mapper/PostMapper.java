package com.example.redditapp.mapper;

import com.example.redditapp.DTO.PostRequestDTO;
import com.example.redditapp.DTO.SubredditRequestDTO;
import com.example.redditapp.DTO.SubredditResponseDTO;
import com.example.redditapp.model.Post;
import com.example.redditapp.model.Subreddit;
import com.example.redditapp.service.SubredditService;
import com.example.redditapp.service.UserService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class PostMapper {


    @Autowired
    private SubredditService subredditService;
    @Autowired
    private  UserService userService;

    @Mapping(target = "voteCount", constant = "0")
    @Mapping(target = "createdDate", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "subreddit", expression = "java(subredditService.findSubreddit(postRequestDTO.getSubredditId()))")
    @Mapping(target = "user", expression = "java(userService.findLoggedInUser())")
    public abstract Post mapDtoToPost(PostRequestDTO postRequestDTO);
}
