/**
 * 
 */
package code;

/**
 * @author uobsep22
 *
 */
public class App {
	/**
	 * this is an object of class
	 * @see Book
	 * @see "Ref how to wirte a class"
	 */
	static Book book;

	/**
	 * create a book object display book details in console 
	 * @param args
	 */
	public static void main(String[] args) {

		book = new Book("Scret", 1, 1990, "Nipuna Sachith");

		String details = book.getBook_name() + " " + book.getBook_id() + " " + book.getYear() + " " + book.getAuthor();
		System.out.println(details);
	}
}
