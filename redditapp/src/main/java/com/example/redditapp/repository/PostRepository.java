package com.example.redditapp.repository;

import com.example.redditapp.model.Post;
import com.example.redditapp.model.Subreddit;
import com.example.redditapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findBySubreddit(Subreddit subreddit);
    List<Post> findByUser(User user);

}
