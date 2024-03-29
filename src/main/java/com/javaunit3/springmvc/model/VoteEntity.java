package com.javaunit3.springmvc.model;

import org.hibernate.SessionFactory;

import javax.persistence.*;

@Entity
@Table(name = "votes")
public class VoteEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "voter_Name")
    private String voterName;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private MovieEntity movie;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getVoterName(){
        return voterName;
    }
    public void setVoterName(String voterName){
        this.voterName = voterName;
    }
}
