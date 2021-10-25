package DAO;

import java.util.ArrayList;
import java.util.List;

import Pojo.BookStoreData;

public class BookStoreDAOImpl implements BookStoreDao {
	
	List<BookStoreData> allBookStore;
	
	public BookStoreDAOImpl() {
		this.allBookStore = new ArrayList<BookStoreData>();
	}

	@Override
	public BookStoreData addBooks(BookStoreData bookStoreData) {
		bookStoreData.setId(allBookStore.size() + 1);
		bookStoreData.setISBN(allBookStore.size() + 101);
		allBookStore.add(bookStoreData);
		return bookStoreData;
	}

	//Save for Later
	@Override
	public BookStoreData updateBooks(BookStoreData bookStoreData) {
		return null;
	}

	//Save for Later
	@Override
	public boolean deleteBooks(int bookId) {
		return false;
	}

	@Override
	public List<BookStoreData> getAllBooks() {
				return allBookStore;
	}

}