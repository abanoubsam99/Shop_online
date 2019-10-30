package com.example.thebest;

public class Group1Table {

    private String Title;
    private String Description;
    private int imgsrc;
    private String price;



    public Group1Table(String title, int imgsrc, String price, String description) {
        Title = title;
        Description = description;
        this.imgsrc = imgsrc;
        this.price = price;
    }

    public Group1Table(String title, int imgsrc, String price) {
        Title = title;
        this.imgsrc = imgsrc;
        this.price = price;
    }




    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(int imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
