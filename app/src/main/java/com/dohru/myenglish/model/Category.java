package com.dohru.myenglish.model;

public class Category {
    private String name;
    private String image;

    public Category(){
    }

    public Category(String name , String image){
        this.setName(name);
        this.setImage(image);
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

}
