package com.company;

public class Book {
    private String name;
    private String author;
    private int price;
    private int quantity;
    private double weight;

    public double getTotalPrice(){
        double result = price * quantity;
        return result;
    }

    public double getTotalWeight() {
        double result = weight * quantity;
        return result;
    }

    public Book(){

    }

    public Book(String name, String author, int price, int quantity, double weight){
        this.name = name;
        this.author = author;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
