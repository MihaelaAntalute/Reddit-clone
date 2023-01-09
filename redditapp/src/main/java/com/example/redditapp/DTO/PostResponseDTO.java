package com.example.redditapp.DTO;

import com.example.redditapp.model.User;

import java.time.Duration;

public class PostResponseDTO {
    private Long postId;
    private String postName;
    private String description;
    private User username;
    private String subredditName;
    private Integer voteCount;
    private Integer commentCount;
    private Long duration;
    private Boolean isUpVoted;
    private Boolean isDownVoted;

    public PostResponseDTO(){}

    public PostResponseDTO(Long postId, String postName, String description, User username, String subredditName, Integer voteCount, Integer commentCount, Long duration, Boolean isUpVoted, Boolean isDownVoted) {
        this.postId = postId;
        this.postName = postName;
        this.description = description;
        this.username = username;
        this.subredditName = subredditName;
        this.voteCount = voteCount;
        this.commentCount = commentCount;
        this.duration = duration;
        this.isUpVoted = isUpVoted;
        this.isDownVoted = isDownVoted;
    }


    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public String getSubredditName() {
        return subredditName;
    }

    public void setSubredditName(String subredditName) {
        this.subredditName = subredditName;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Boolean getUpVoted() {
        return isUpVoted;
    }

    public void setUpVoted(Boolean upVoted) {
        isUpVoted = upVoted;
    }

    public Boolean getDownVoted() {
        return isDownVoted;
    }

    public void setDownVoted(Boolean downVoted) {
        isDownVoted = downVoted;
    }
}
