package com.bolero.boleroteam.model;

import javax.persistence.*;

@Entity
@Table
public class PlayList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id ;

    @ManyToOne
    private User user;

    @ManyToOne
    private Song song ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
