package Pojo;

//private variables
//public getters/setters
//default constructor
//parametrized construction

//overide equals()
//overide hashcode()
//overide toString()

public class BookStoreData {
	
	private  String bookTitle;
	private  String bookPublisher;
    private  int bookId;
    private  int bookISBN;
    
    public BookStoreData() {
    	super();
    }
    
	@SuppressWarnings("unused")
	private BookStoreData(String title, String publisher, int id, int iSBN) {
		super();
		this.bookTitle = title;
		this.bookPublisher = publisher;
		this.bookId = id;
		bookISBN = iSBN;
	}
	
	public String getTitle() {
		return bookTitle;
	}

	public void setTitle(String title) {
		this.bookTitle = title;
	}

	public String getPublisher() {
		return bookPublisher;
	}

	public void setPublisher(String publisher) {
		this.bookPublisher = publisher;
	}

	public int getId() {
		return bookId;
	}

	public void setId(int id) {
		this.bookId = id;
	}

	public int getISBN() {
		return bookISBN;
	}

	public void setISBN(int iSBN) {
		bookISBN = iSBN;
	}
	@Override
	public String toString() {
		return  "BooStoreData [ bookTitle= "  +bookTitle +  " ,  " + "bookPublisher= "+ bookPublisher +  " , " +"bookId= " +bookId +  ", "  +"bookISBN= "+bookISBN +  " ] \n" ;
	}

}
