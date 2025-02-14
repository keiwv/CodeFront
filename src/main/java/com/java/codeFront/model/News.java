package com.java.codeFront.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int NewsID;

    @Column(nullable = false)
    private String Title;

    @Column(length = 500)
    private String ShortDescription;

    @Temporal(TemporalType.TIMESTAMP)
    private Date DatePublished;

    private String Author;
    private String Source;
    private String Url;

    // Constructor vacío (necesario para JPA)
    public News() {}

    // Getters y Setters
    public int getNewsID() {
        return NewsID;
    }

    public void setNewsID(int NewsID) {
        this.NewsID = NewsID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getShortDescription() {
        return ShortDescription;
    }

    public void setShortDescription(String ShortDescription) {
        this.ShortDescription = ShortDescription;
    }

    public Date getDatePublished() {
        return DatePublished;
    }

    public void setDatePublished(Date DatePublished) {
        this.DatePublished = DatePublished;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    @Override
    public String toString() {
        return "News{" +
                "NewsID=" + NewsID +
                ", Title='" + Title + '\'' +
                '}';
    }
}
