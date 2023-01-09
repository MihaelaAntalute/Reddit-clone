package com.example.redditapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_seq")
    @SequenceGenerator(name = "category_seq",
            sequenceName = "category_seq",
            initialValue = 1,
            allocationSize = 1)
    private Long id;
    @Column
    private String postName;
    @Column
    private String description;
    @Column
    private Integer voteCount;
    @Column
    private LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn(name = "subreddit_Id")
    @JsonBackReference(value = "subreddit-post")
    private Subreddit subreddit;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "post-vote")
    private List<Vote> voteList;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    @JsonBackReference(value = "user-post")
    private User user;


    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "post-comment")
    private List<Comment> commentList;


    public Post(Long id, String postName, String description, Integer voteCount, LocalDateTime createdDate, Subreddit subreddit, List<Vote> voteList, User user, List<Comment> commentList, List<Vote> vote) {
        this.id = id;
        this.postName = postName;
        this.description = description;
        this.voteCount = voteCount;
        this.createdDate = createdDate;
        this.subreddit = subreddit;
        this.voteList = voteList;
        this.user = user;
        this.commentList = commentList;
        this.voteList = vote;
    }

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Subreddit getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(Subreddit subreddit) {
        this.subreddit = subreddit;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getCommentList() {
        if(this.commentList == null){
            this.commentList = new ArrayList<>();
        }
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Vote> getVoteList() {
        if(this.voteList == null){
            this.voteList = new ArrayList<>();
        }
        return voteList;
    }

    public void setVoteList(List<Vote> vote) {
        this.voteList = vote;
    }

}
