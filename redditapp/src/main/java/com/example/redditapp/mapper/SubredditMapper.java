package com.example.redditapp.mapper;

import com.example.redditapp.DTO.SubredditRequestDTO;
import com.example.redditapp.DTO.SubredditResponseDTO;
import com.example.redditapp.model.Subreddit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public abstract class SubredditMapper {
    @Mapping(target = "createdDate", expression = "java(java.time.LocalDateTime.now())")
    public abstract Subreddit mapDtoToSubreddit (SubredditRequestDTO subredditRequestDTO);

    @Mapping(target = "numberOfPosts", expression = "java(subreddit.getPostList().size())")
    public abstract SubredditResponseDTO mapSubredditToDto (Subreddit subreddit);

}
