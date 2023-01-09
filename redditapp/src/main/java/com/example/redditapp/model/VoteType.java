package com.example.redditapp.model;

public enum VoteType {

    UP_VOTE  (+1),
    DOWN_VOTE (-1);


    public final Integer value;

    VoteType(Integer value) {
        this.value = value;
    }

    public Integer getVoteValue (){
        return this.value;
    }
}
