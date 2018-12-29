package org.troparo.web.service;

import org.troparo.business.contract.BookManager;
import org.troparo.entities.book.*;
import org.troparo.model.Book;
import org.troparo.services.bookservice.BusinessException;
import org.troparo.services.bookservice.IBookService;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.*;

@WebService(serviceName = "BookService", endpointInterface = "org.troparo.services.bookservice.IBookService",
        targetNamespace = "http://troparo.org/services/BookService/", portName = "BookServicePort", name = "BookServiceImpl")
public class BookServiceImpl implements IBookService {

    @Inject
    private BookManager bookManager;

    private String exception = "";
    private List<Book> bookList = new ArrayList<>();;
    private BookTypeOut bookTypeOut;
    private BookListType bookListType = new BookListType();

    @Override
    public GetBookByIdResponseType getBookById(GetBookByIdRequestType parameters) throws BusinessException {

        System.out.println("new method added");
        GetBookByIdResponseType rep = new GetBookByIdResponseType();
        BookTypeOut bt = new BookTypeOut();
        Book book = bookManager.getBookById(parameters.getReturn());
        if(book == null){
            throw new BusinessException("no book found with that id");
        }else {
            bt.setId(book.getBookId());
            bt.setISBN(book.getIsbn());
            bt.setTitle(book.getTitle());
            bt.setAuthor(book.getAuthor());
            bt.setEdition(book.getEdition());
            bt.setNbPages(book.getNbPages());
            bt.setKeywords(book.getIsbn());
            rep.setBookTypeOut(bt);
        }
        return  rep;
    }

    @Override
    public GetBookByCriteriasResponseType getBookByCriterias(GetBookByCriteriasRequestType parameters) throws BusinessException {
        HashMap<String, String> map = new HashMap<>();
        BookCriterias criterias = parameters.getBookCriterias();
        map.put("ISBN", criterias.getISBN());
        map.put("Title", criterias.getTitle());
        map.put("Author", criterias.getAuthor());
        System.out.println("map: "+map);
        bookList.clear();
        bookListType.getBookTypeOut().clear();
        bookList = bookManager.getBooksByCriterias(map);
        GetBookByCriteriasResponseType brt = new GetBookByCriteriasResponseType();
        System.out.println("bookListType beg: "+bookListType.getBookTypeOut().size());

        for (Book book : bookList) {

            // set values retrieved from DAO class
            bookTypeOut = new BookTypeOut();
            bookTypeOut.setId(book.getBookId());
            bookTypeOut.setISBN(book.getIsbn());
            bookTypeOut.setTitle(book.getTitle());
            bookTypeOut.setAuthor(book.getAuthor());
            bookTypeOut.setEdition(book.getEdition());

            try {
                GregorianCalendar c = new GregorianCalendar();
                Date date = book.getPublication();
                XMLGregorianCalendar xmlDate;
                xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
                bookTypeOut.setPublication(xmlDate);
            } catch (DatatypeConfigurationException e) {
                e.printStackTrace();
            }

            bookTypeOut.setEdition(book.getEdition());
            bookTypeOut.setNbPages(book.getNbPages());
            bookTypeOut.setKeywords(book.getKeywords());
            bookListType.getBookTypeOut().add(bookTypeOut); // add bookType to the movieListType
            System.out.println("bookListType end: "+bookListType.getBookTypeOut().size());
            brt.setBookListType(bookListType);
        }
        return brt;
    }


    @Override
    public BookListResponseType getAllBooks(BookListRequestType parameters) throws BusinessException {

        bookList = bookManager.getBooks();
        System.out.println("size list: " + bookList.size());

        BookListResponseType bookListResponseType = new BookListResponseType();

        for (Book book : bookList) {

            // set values retrieved from DAO class
            bookTypeOut = new BookTypeOut();
            bookTypeOut.setId(book.getBookId());
            bookTypeOut.setISBN(book.getIsbn());
            bookTypeOut.setTitle(book.getTitle());
            bookTypeOut.setAuthor(book.getAuthor());
            bookTypeOut.setEdition(book.getEdition());

            try {
                GregorianCalendar c = new GregorianCalendar();
                Date date = book.getPublication();
                XMLGregorianCalendar xmlDate;
                xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
                bookTypeOut.setPublication(xmlDate);
            } catch (DatatypeConfigurationException e) {
                e.printStackTrace();
            }

            bookTypeOut.setEdition(book.getEdition());
            bookTypeOut.setNbPages(book.getNbPages());
            bookTypeOut.setKeywords(book.getKeywords());
            bookListType.getBookTypeOut().add(bookTypeOut); // add bookType to the movieListType
        }

        bookListResponseType.setBookListType(bookListType);
        return bookListResponseType;

    }

    @Override
    public AddBookResponseType addBook(AddBookRequestType parameters) throws BusinessException {
        AddBookResponseType ar = new AddBookResponseType();
        ar.setReturn(true);
        Book book = new Book();
        BookTypeIn bt = parameters.getBookTypeIn();
        book.setIsbn(bt.getISBN());
        book.setTitle(bt.getTitle());
        book.setAuthor(bt.getAuthor());
        book.setInsert_date(new Date());
        book.setPublication(new Date());
        book.setEdition(bt.getEdition());
        book.setNbPages(bt.getNbPages());
        book.setKeywords(bt.getKeywords());
        System.out.println("bookManager: " + bookManager);
        exception = bookManager.addBook(book);
        if (exception != null) {
            throw new BusinessException(exception);
        }

        return ar;
    }
}
