package Assignment_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<String> categoryList = new ArrayList<>();
    private static List<Author> authorList = new ArrayList<Author>();
    private static List<Book> bookList = new ArrayList<Book>();

    public Library(){
        // Add authors
        Author author1 = new Author("Min Lu", "Myanmar");
        Author author2 = new Author("Min Thein Kha", "Myanmar");
        Author author3 = new Author("Stephen Hawking", "England");
        authorList.add(author1);
        authorList.add(author2);
        authorList.add(author3);

        // Add Categories
        categoryList.add("Romance Fiction");
        categoryList.add("Comedy");
        categoryList.add("Mystery");
        categoryList.add("Science");

        // Add Books
        Book book1 = new Book(1, "Aung Bar Lay", LocalDate.of(2010, 1, 1), author1, "Comedy");
        Book book2 = new Book(2,  "May Shaut Wizza Shwe Mya Thar", LocalDate.of(1997, 1, 1), author2, "Mystery");
        Book book3 = new Book(3, "A Brief History of Time", LocalDate.of(1988, 1, 1), author3, "Science");
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);  
    }
    // view all book Information
    public void viewAllBookInformation(){
        for (Book book : bookList) {
            System.out.println("Code: " + book.getCode());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Publish Date: " + book.getPublishDate());
            System.out.println("Category: " + book.getCategory());
            System.out.println("Author: " + book.getAuthor().getName());
            System.out.println("--------------------");
        }
    }
    // view all author information
    public void viewAllAuthorInformation(){
        for (Author author : authorList) {
            System.out.println("Name: " + author.getName());
            System.out.println("Country: " + author.getCountry());
            System.out.println("--------------------");
        }
    }
    // view all book category information
    public void viewAllCategoryInformation(){
        System.out.println("The categories are - ");
        for (String category : categoryList) {
            System.out.println(category);
        }
    }

    // View bookList according to author name
    public void viewBookWithAuthor(String authorName) {
    	
    }
}
