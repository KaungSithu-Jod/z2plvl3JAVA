package Assignment_2;

import java.time.LocalDate;

public class Book {
	// fields
	private int code;
	private String title;
	private LocalDate publishDate;
	private String category;
	private Author author;

	// constructor
	public Book(){

	}

	public Book(int code, String title){
		this.code = code;
		this.title = title;
	}

	public Book(int code, String title, Author author){
		this.code = code;
		this.title = title;
		this.author = author;
	}

	public Book(int code, String title, LocalDate publshDate, Author author, String category){
		this.code = code;
		this.title = title;
		this.publishDate = publshDate;
		this.author = author;
		this.category = category;
	}

	// setter
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	// getter
	public int getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public String getCategory() {
		return category;
	}

	public Author getAuthor() {
		return author;
	}
	

}
