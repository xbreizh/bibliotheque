package org.troparo.consumer.contract;

import org.troparo.model.Book;

import javax.inject.Named;
import java.util.HashMap;
import java.util.List;


public interface BookDAO {

    List<Book> getBooks();
    boolean addBook(Book book);
    Book getBookById(int id);

    List<Book> getBooksByCriterias(HashMap<String, String> map);

    boolean updateBook(Book book);

    boolean remove(Book book);

    int getAvailable(String isbn);
}