package com.OnlineBookStore.DAO;

import java.util.ArrayList;

import com.OnlineBookStoreTO.Book;

public interface BookDAO {

	boolean addBook(Book book);

	ArrayList<Book> getBook();

	boolean removeBook(String id,String name);

}
