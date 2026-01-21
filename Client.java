package lms;

import lms.model.*;

public class Client {
    public static void main(String[] args) {
        Novel n1 = new Novel(123, "jorrd boy", "game", true);
        Novel n2 = new Novel(125, "Mervel", "Comic", true);

        TextBook t1 = new TextBook(9663, "c++", "programing", true);
        TextBook t2 = new TextBook(9563, "Java", "programing", true);

        Member m1 = new Member("Subha op");
        Member m2 = new Member("Raj");
        Employee e1 = new Employee("Sir");

        LMS l = new LMS();
        l.addBook(n1);
        l.addBook(n2);
        l.addBook(t1);
        l.addBook(t2);

        l.addUser(m1);
        l.addUser(m2);
        l.addUser(e1);

        System.out.println("--- All Books ---");
        l.displayBooks();

        System.out.println("\n--- Search Results for 'Java' ---");
        for (Book b : l.searchBooks("Java")) {
            b.displayBookDetails();
        }

        System.out.println("\n--- User Dashboards ---");
        m1.userDashboard();
        e1.userDashboard();

        System.out.println("\n--- Lending Test ---");
        n1.lend(m1);
        n1.isAvailable();

    }
}
