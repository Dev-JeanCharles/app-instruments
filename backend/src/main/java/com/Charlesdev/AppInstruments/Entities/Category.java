package com.Charlesdev.AppInstruments.Entities;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable {

    private Long categoryID;
    private String name;
    private String technicalName;
    private String description;
    private String image;

    public Category () {

    }

    public Category(Long categoryID, String name, String technicalName, String description, String image) {
        this.categoryID = categoryID;
        this.name = name;
        this.technicalName = technicalName;
        this.description = description;
        this.image = image;
    }
    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnicalName() {
        return technicalName;
    }

    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return Objects.equals(getCategoryID(), category.getCategoryID()) && Objects.equals(getName(), category.getName()) && Objects.equals(getTechnicalName(), category.getTechnicalName()) && Objects.equals(getDescription(), category.getDescription()) && Objects.equals(getImage(), category.getImage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategoryID(), getName(), getTechnicalName(), getDescription(), getImage());
    }
}
