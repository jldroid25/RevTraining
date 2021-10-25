package ServiceLayer;

import java.util.List;

import Pojo.BookStoreData;

public interface BookStoreServiceLayer {	
	
	BookStoreData  addBooksServices(BookStoreData bookStoreData );
	BookStoreData updateBooksServices(BookStoreData bookStoreData );
	public boolean deleteBooksServices(int bookId);
	List <BookStoreData>getAllBooksServices();
}