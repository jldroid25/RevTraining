package PresentationLayer;

import java.util.List;
import java.util.Scanner;
import Pojo.BookStoreData;
import ServiceLayer.BookStoreServiceImpl;
import ServiceLayer.BookStoreServiceLayer;

public class BookStoreMain {

	// Class to create Objects, get/push users inputs to other layers
	// and display the data

	public static void main(String[] args) {
		BookStoreServiceLayer bookStoreService = new BookStoreServiceImpl();

		Scanner scanner = new Scanner(System.in);
		int option = 0;
		String character = "y";

		while ("y".equals(character)) {
			System.out.println("\n******************************");
			System.out.println(" WELCOME TO JAMES BOOKSTORE ");
			System.out.println("******************************\n");
			System.out.println("1.  add a Book");
			System.out.println("2.  update a Book");
			System.out.println("3.  Remove a Book");
			System.out.println("4.  List all Books");
			System.out.println("5.  Exit");
			System.out.println("\nPlease enter your option \n");
			option = Integer.parseInt(scanner.nextLine());
			System.out.println("****************************** \n");

			switch (option) {

			case 1:
				BookStoreData bookStoreData = new BookStoreData();
				System.out.println("Enter a Book Title");
				bookStoreData.setTitle(scanner.nextLine());

				System.out.println("Enter a Book Publisher");
				bookStoreData.setPublisher(scanner.nextLine());

				BookStoreData returnedBookStoreData = bookStoreService.addBooksServices(bookStoreData);
				System.out.println("Book was added successfully !!");
				System.out.println("New Book Id is : " + returnedBookStoreData.getId());
				break;

			case 2:
				System.out.println("Update Book - Sorry Feature is not yet available \n");
				break;

			case 3:
				System.out.println("Remove Book - Sorry Feature is not yet available \n");
				break;

			case 4:
				List<BookStoreData> allStoreBooks = bookStoreService.getAllBooksServices();
				System.out.println(allStoreBooks.size());
				System.out.println(allStoreBooks);

				// ------Formatting the Display result for all books
				System.out.println("\tID \tTITLE \tPUBLISHER \tISBN");

				allStoreBooks.forEach((myBookStoreData) -> {
					System.out.println(myBookStoreData.getId() + "\t " + myBookStoreData.getTitle() + "\t "
							+ myBookStoreData.getPublisher() + "\t " + myBookStoreData.getISBN());
					System.out.println("\n");
				});

				System.out.println();
				break;

			case 5:
				System.out.println(" Thank You for using Website !!");
				System.out.println(" Leaving the Application . . .");
				System.out.println("**************************");
				System.exit(0);
				break;

			default:
				System.out.println("Please Enter a valid Option");
				continue;
			}
			System.out.println("*****************************");
			System.out.println("Do You want to Continue (y/n) :");
			character = scanner.nextLine();

			if ("y".equalsIgnoreCase(character)) {
				continue;
			} else {
				System.out.println("**************************");
				System.out.println(" Thank You for using Website !!");
				System.out.println(" Leaving the Application . . .");
				System.out.println("**************************");
				System.exit(0);
			}

			scanner.close();
		}

	}// main

}// class