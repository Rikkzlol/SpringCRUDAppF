package ru.malyushov.springcourse.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Book {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message ="Name should be between 2 and 30 characters")
    private String title;
    @NotEmpty(message = "Author should not be empty")
    @Size(min = 2, max = 30, message ="Name should be between 2 and 30 characters")
    private String author;
    @NotEmpty(message = "Year should not be empty")
    @Pattern(regexp = "\\d{4}", message = "Your should be in this format: year of production ****")
    private int year;

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


