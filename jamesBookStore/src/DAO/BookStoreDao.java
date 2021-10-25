package DAO;

import java.util.List;

import Pojo.BookStoreData;

public interface BookStoreDao {
	BookStoreData  addBooks(BookStoreData  bookStoreData);
	BookStoreData  updateBooks(BookStoreData  bookStoreData);
	boolean  deleteBooks(int  bookId);
	List<BookStoreData> getAllBooks();
}