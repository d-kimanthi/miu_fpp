package lab8.Prob3;

import java.util.HashMap;

public class Library {
    private final HashMap<String, Book> books;
    public Library(){
        books = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author){
        if(ISBN == null || title == null || author == null ||
                ISBN.isEmpty() || title.isEmpty() || author.isEmpty()) System.out.println("Invalid book");
        else if(books.containsKey(ISBN)) System.out.println(ISBN + " already exists");
        else{
            books.put(ISBN, new Book(ISBN, title, author));
            System.out.println(ISBN + " successfully added into library");
        }
    }

    public void borrowBook(String ISBN){
        if(!books.containsKey(ISBN)) System.out.println(ISBN + " book not exists");
        else{
            Book book = books.get(ISBN);

            if(book.isBorrowed()) System.out.println(ISBN + " unavailable to borrow");

            book.setBorrowed(true);
            System.out.println(ISBN + " successfully borrowed");
        }
    }

    public void returnBook(String ISBN){
        if(!books.containsKey(ISBN)) System.out.println(ISBN + " book not exists");
        else{
            Book book = books.get(ISBN);

            if(!book.isBorrowed()) System.out.println(ISBN + " unavailable to return");

            book.setBorrowed(false);
            System.out.println(ISBN + " successfully returned");
        }
    }

    public void isBookBorrowed(String ISBN){
        if(!books.containsKey(ISBN)) System.out.println(ISBN + " book not exists");

        System.out.println(ISBN + " is " + (books.get(ISBN).isBorrowed() ? "" : "not") + " borrowed");
    }

    public void getBookDetails(String ISBN){
        if(!books.containsKey(ISBN)) System.out.println(ISBN + " book not exists");
        else System.out.println("Book Detail: " + books.get(ISBN));
    }

    public void listAllBooks(){
        if(books.isEmpty()) System.out.println("Library is empty");

        System.out.println("Library books list: ");
        for(Book book : books.values()){
            System.out.println(book);
        }
    }

    public void listBorrowedBooks(){
        if(books.isEmpty()) System.out.println("Library is empty");

        System.out.println("Library books list: ");
        for(Book book : books.values()){
            if(book.isBorrowed())
                System.out.println(book);
        }
    }
}
