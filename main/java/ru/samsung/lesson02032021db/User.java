package ru.samsung.lesson02032021db;


public class User {
    private long id;
    private String name;
    private int year;

    public User(long id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return this.name + " : " + this.year;
    }
}