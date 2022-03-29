package tr.edu.maltepe.oop;
import java.util.Vector;

public class MaltepeLibrary {
    private Vector books;

    public MaltepeLibrary() {
        books = new Vector();
    }

    public void addBook(Books abook) {
        books.add(abook);
    }

    public void removeBook(Books rbook) {
        books.remove(rbook);
    }

    public void lendBook(Person person, Books book) {
        if (books.contains(book)) {
            person.borrowBook(book);
            removeBook(book);
            System.out.println(book.getBookname() + " borrowed by\n " + person.getName());
            System.out.println(" ");

        } else {
            System.out.println(book.getBookname() + " is not available.");
            System.out.println(" ");
        }
    }
}