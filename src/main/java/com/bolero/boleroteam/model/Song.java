package com.bolero.boleroteam.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String image;

//    @NotEmpty
    private String lyrics;
    private String fileMp3;
    private LocalDateTime dateSubmitted;

    @NotEmpty
    private String singer;

    @NotEmpty
    private String author;
    private Long views;

    @ManyToOne
    private Style style;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getFileMp3() {
        return fileMp3;
    }

    public void setFileMp3(String fileMp3) {
        this.fileMp3 = fileMp3;
    }

    public LocalDateTime getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(LocalDateTime dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

//    public Song() {
//
//    }

//    public Song(Long id, String name, String image, String lyrics, String fileMp3, Date dateSubmitted, String singer, String author, Long views, Style style) {
//        this.id = id;
//        this.name = name;
//        this.image = image;
//        this.lyrics = lyrics;
//        this.fileMp3 = fileMp3;
//        this.dateSubmitted = dateSubmitted;
//        this.singer = singer;
//        this.author = author;
//        this.views = views;
//        this.style = style;
//    }
}
