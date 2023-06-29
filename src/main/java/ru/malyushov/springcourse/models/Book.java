package ru.malyushov.springcourse.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Book {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message ="Name should be between 2 and 30 characters")
    private String name;
    @NotEmpty(message = "Author should not be empty")
    @Size(min = 2, max = 30, message ="Name should be between 2 and 30 characters")
    private String author;
    @NotEmpty(message = "Year should not be empty")
    @Pattern(regexp = "\\d{4}", message = "Your should be in this format: year of production ****")
    private int ageOfProduction;

    public Book(int id, String name, String author, int ageOfProduction) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.ageOfProduction = ageOfProduction;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAgeOfProduction() {
        return ageOfProduction;
    }

    public void setAgeOfProduction(int ageOfProduction) {
        this.ageOfProduction = ageOfProduction;
    }
}


