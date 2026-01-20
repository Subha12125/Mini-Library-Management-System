package lms.model;

public class TextBook extends Book{
    private String genre;
    public TextBook(int isbn, String name, String genre,boolean isAvailable){
        super(isbn, name, isAvailable);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Novel Details :");
        System.out.println("The book title is: " + getName() + " and the genre is " + this.genre);
    }
}
