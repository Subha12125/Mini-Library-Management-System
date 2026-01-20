package lms.model;

import lms.interfaces.lendable;

public abstract class Book implements lendable {
    private int isbn;
    private String name;
    private boolean isAvailable;

    //constructor
    public Book(int isbn, String name, boolean isAvailable) {
        this.isbn = isbn;
        this.name = name;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    @Override
    public boolean lend(User user) {
        if(isAvailable()){
            System.out.println("This book:" + getName() + " is lended to " + user.getName());
            isAvailable = false;
            return true;
        }
        System.out.println("This Book is not available: ");
        return false;

    }

    @Override
    public void returnBook(User user) {
        System.out.println("This Book: " + getName() +"is returned by " + user.getName());
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        if(isAvailable){
            System.out.println("This Book is avaiable");
        }
        System.out.println("This Book is not available");
        return false;
    }

    public abstract void displayBookDetails();
}
