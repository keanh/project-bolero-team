package com.bolero.boleroteam.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class PlayList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String name;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Song> songList;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }
}
