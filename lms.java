package lms;

import lms.model.Book;
import lms.model.User;

import java.util.ArrayList;
import java.util.List;

public class LMS {
    public static List<Book> bookInventory;
    public static List<User> registereduser;

    public LMS(){
        bookInventory = new ArrayList<Book>();
        registereduser = new ArrayList<>();
    }

    public void addBook(Book book){
        bookInventory.add(book);
    }
    public void addUser(User user){
        registereduser.add(user);
    }

    public List<Book> searchBooks(String name){
        List<Book> results = new ArrayList<>();
        for(Book b : bookInventory){
            if(b.getName().toLowerCase().contains(name.toLowerCase())){
                results.add(b);
            }
        }
        return results;
    }

    public void displayBooks(){
        for(Book b : bookInventory){
            b.displayBookDetails();
        }
    }
}
