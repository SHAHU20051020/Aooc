// Save this entire code in a file named: LibrarySystem.java

package LibraryManagement; // Aim: Implementation of user defined package

// Class Book as per problem statement
class Book {
    String title;
    String author;
    String isbn;

    // Book class should have attributes like title, author, and ISBN
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayBook() {
        System.out.println("--- Book Details ---");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN   : " + isbn);
    }
}

// Member class to store member details
class Member {
    String name;
    int memberId;

    Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    void displayMember() {
        System.out.println("--- Member Details ---");
        System.out.println("Name      : " + name);
        System.out.println("Member ID : " + memberId);
    }
}

// Main class to demonstrate the library system
public class Q1 {
    public static void main(String[] args) {
        // Create instances to use the package classes
        Book myBook = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Member myMember = new Member("Ananya", 1024);

        // Display the details
        myBook.displayBook();
        System.out.println();
        myMember.displayMember();
    }
}