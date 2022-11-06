package code;

/**
 * This Class written to represent the details of book
 * 
 * @author Nipuna
 * @version 1.0
 *
 */
/**
 * @author uobsep22
 *
 */
public class Book {

	/**
	 * This is to store the name of the book
	 */
	private String book_name;
	/**
	 * This is to store the id of the book
	 */
	private int book_id;
	/**
	 * This is to store the year of the book
	 */
	private int year;
	/**
	 * This is to store the author of the book
	 */
	private String author;

	/**
	 * This Is the Constructor set all the attributes of the Book Class
	 * 
	 * @param book_name
	 * @param book_id
	 * @param year
	 * @param author
	 */
	public Book(String book_name, int book_id, int year, String author) {
		this.book_name = book_name;
		this.book_id = book_id;
		this.year = year;
		this.author = author;
	}

	/**
	 * 
	 */
	public Book() {
	}

	/**
	 * this method returns the name of the book
	 * 
	 * @return String
	 */
	public String getBook_name() {
		return book_name;
	}

	/**
	 * this method returns the id of the book
	 * 
	 * @return int
	 */
	public int getBook_id() {
		return book_id;
	}

	/**
	 * this method returns the year of the book
	 * 
	 * @return int
	 */
	public int getYear() {
		return year;
	}

	/**
	 * this method returns the author of the book
	 * 
	 * @return String
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

}
