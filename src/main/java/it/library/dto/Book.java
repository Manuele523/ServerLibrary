package it.library.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "isbn")
    private String code;

    @Column(name = "publicationdate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationdate;

    @Column(name = "price")
    private Float price;

    @Column(name = "storyline")
    private String storyline;

    @Column(name = "star")
    private Boolean star;


    public Book() {
    }

    public Book(String title, String code, Date publicationdate, Float price, String storyline, Boolean star) {
        this.title = title;
        this.code = code;
        this.publicationdate = publicationdate;
        this.price = price;
        this.storyline = storyline;
        this.star = star;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getPublicationdate() {
        return publicationdate;
    }

    public void setPublicationdate(Date publicationdate) {
        this.publicationdate = publicationdate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getStoryline() {
        return storyline;
    }

    public void setStoryline(String storyline) {
        this.storyline = storyline;
    }

    public Boolean getStar() {
        return star;
    }

    public void setStar(Boolean star) {
        this.star = star;
    }
}
