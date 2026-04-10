package com.springrest.springrest.entities;

public class course {


    private long id;
    private String tittle;
    private String description;

    public course(long id, String description, String tittle) {
        this.id = id;
        this.description = description;
        this.tittle = tittle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "course{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}




