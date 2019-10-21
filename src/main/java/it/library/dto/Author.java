package it.library.dto;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "yearborn")
    private Date yearborn;

    public Author() {}

    public Author(String name, String surname, Date yearborn) {
        this.name = name;
        this.surname = surname;
        this.yearborn = yearborn;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getYearborn() {
        return yearborn;
    }

    public void setYearborn(Date yearborn) {
        this.yearborn = yearborn;
    }
}
