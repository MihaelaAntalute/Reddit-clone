package com.example.redditapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_seq")
    @SequenceGenerator(name = "category_seq",
            sequenceName = "category_seq",
            initialValue = 1,
            allocationSize = 1)
    private Long id;
    @Column
    private String text;
    @Column
    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = "post_Id")
    @JsonBackReference(value = "post-comment")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    @JsonBackReference(value = "user-comment")
    private User user;

    public Comment() {
    }

    public Comment(Long id, String text, LocalDateTime creationDate, Post post, User user) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.post = post;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
