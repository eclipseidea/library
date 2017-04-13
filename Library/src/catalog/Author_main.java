package catalog;

import java.util.Scanner;



public class Author_main {
	static Scanner scanner = new Scanner(System.in);
    public static void info(){
    	System.out.println("INPUT SURENAME OR NAME OF AUTHOR");
    }
    
    public static void info2(){
    	System.out.println("INPUT NAME OF BOOK");
    }
	
    public static void main(String[] args) {
		Library library = new Library();
		while (true){
		System.out.println("input 1 for add autor");
		System.out.println("input 2 for add  book to autor");
		System.out.println("input 3 for remove book from autor");
		System.out.println("input 4 for remove autor");
		System.out.println("input 5 for remove all books from author");
		System.out.println("input 6 for sort by year of publishing");
		System.out.println("input 7 for sort by numbers of page");
		System.out.println("input 8 for show all libray");
		System.out.println("input 9 for exit");
		System.out.println();
		String menu = Author_main.scanner.nextLine();

		switch (menu) {
		case "1":
			library.addAuthorToList();
			break;
		case "2":
			library.addBookToAuthor();
			break;
		case "3":
			library.deleteBook();
			break;
		case "4":
			library.deleteAuthor();
			break;
		case "5":
			library.delettAllBooksFromAuthor();
			break;
		case "6":
			library.SortByYearOfPublishing();
			break;
		case "7":
			library.sortByNumberOfPage();
			break;
		case "8":
			library.showAllLibrary();
			break;
		case "9":
			System.exit(8);
			break;
		}
		
		
	}
	
	}
}
