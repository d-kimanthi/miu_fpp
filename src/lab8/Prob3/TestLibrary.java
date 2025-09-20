package lab8.Prob3;

public class TestLibrary {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook("ISBN-1", "title-1", "author-1");
        lib.addBook(null, null, null);
        lib.addBook("ISBN-2", "title-2", "author-2");
        lib.addBook("ISBN-3", "title-3", "author-3");

        lib.borrowBook("ISBN-2");
        lib.borrowBook("ISBN-3");
        lib.borrowBook("ISBN-50000000");

        lib.returnBook("ISBN-2");
        lib.returnBook("ISBN-6666");

        lib.isBookBorrowed("ISBN-1");
        lib.isBookBorrowed("ISBN-3");
        lib.isBookBorrowed("ISBN-2");

        lib.getBookDetails("ISBN-1");
        lib.getBookDetails("ISBN-11111");

        lib.listAllBooks();

        lib.listBorrowedBooks();
    }
}
