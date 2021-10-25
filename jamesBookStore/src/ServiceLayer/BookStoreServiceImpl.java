package ServiceLayer;

import java.util.List;

import DAO.BookStoreDAOImpl;
import DAO.BookStoreDao;
import Pojo.BookStoreData;

public class BookStoreServiceImpl implements BookStoreServiceLayer {
	
	BookStoreDao bookStoreDao;
	
	public BookStoreServiceImpl() {
		this.bookStoreDao = new BookStoreDAOImpl();
	}

	@Override
	public BookStoreData addBooksServices(BookStoreData bookStoreData) {
		return this.bookStoreDao.addBooks(bookStoreData);
	}

	//Save for Later
	@Override
	public BookStoreData updateBooksServices(BookStoreData bookStoreData) {
		return null;
	}

	//Save for later
	@Override
	public boolean deleteBooksServices(int bookId) {
		return false;
	}

	@Override
	public List<BookStoreData> getAllBooksServices() {
		return this.bookStoreDao.getAllBooks();
	}

	
}