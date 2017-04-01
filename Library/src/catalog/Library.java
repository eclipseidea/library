package catalog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

/*Створити клас Бібліотека, в якому передбачити реалізацію наступних методів:
-- Додати автора в список;
-- Закріпити книжку за даним автором;
-- Видалити книжку за даним автором;
-- Видалити автора(зі всіма його книжками);
-- Вивалити всі книжки що закріплені за автором;
-- Провести сортування книг що закріплені за певним автором за датою їх видання;
-- Провести сортування книг що закріплені за певним автором за кількістю їхніх сторінок;
-- Вивести всю бібліотеку на консолю;
-- Вихід з програми;*/

public class Library {
    Map<Author, List<Book>> map=new HashMap<>();;
    
    public Library() {
		super();
	}
	
	public void addAuthorToList() {
		map.put(new Author(160 + (int) (Math.random() * (220 - 160)),
		  50 + (int) (Math.random() * (150 - 50)),
			20 + (int) (Math.random() * (80 - 20)), 
			  "name-"+ UUID.randomUUID().toString().replaceAll("[0 9]", "").toUpperCase().substring(0, 5),
				"surname-"+ UUID.randomUUID().toString().replaceAll("[0 9]", "").toUpperCase().substring(0, 5)),
				  new ArrayList<Book>());
		System.out.println(map);
	}

	public void addBookToAuthor(){
		Author_main.info();
		   String nameOrSurename= Author_main.scanner.nextLine(); 
	         Iterator<Entry<Author, List<Book>>>iterator = map.entrySet().iterator();
	            while (iterator.hasNext()) {
			       Entry<Author, List<Book>> map = iterator.next();
	    	         if(map.getKey().getName().equalsIgnoreCase(nameOrSurename)||map.getKey().getSurname().equalsIgnoreCase(nameOrSurename)){
	    		       map.getValue().add(new Book(UUID.randomUUID().toString().replaceAll("[0 9]", "").toUpperCase().substring(0, 5),
	    		         1945  + (int) (Math.random() * (2017 - 1945)), 20 + (int) (Math.random() * (1000- 20))));
	    	        }
		      }	
	    System.out.println(map);
	}
  
   public void deleteBook(){
	   Author_main.info2(); 
            String nameOfBook = Author_main.scanner.nextLine();
            Iterator<Entry<Author, List<Book>>>iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
            	 Entry<Author, List<Book>> map = iterator.next();
            	 Iterator<Book>iter = map.getValue().iterator();  
            	 while (iter.hasNext()) {
           		     Book book = iter.next();
            		 if(book.getNameOfBook().equalsIgnoreCase(nameOfBook)){
            			 iter.remove();
                     }
                 }
           }
            System.out.println(map);
   }
   
   public void deleteAuthor(){
	   Author_main.info();
	   String nameOrSurename= Author_main.scanner.nextLine(); 
         Iterator<Entry<Author, List<Book>>>iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
		       Entry<Author, List<Book>> map = iterator.next();
    	         if(map.getKey().getName().equalsIgnoreCase(nameOrSurename)||map.getKey().getSurname().equalsIgnoreCase(nameOrSurename)){
    	        	 iterator.remove();
    	        }
	      }	
            System.out.println(map);
   }
  
   public void delettAllBooksFromAuthor(){
	   Author_main.info();
	   String nameOrSurename= Author_main.scanner.nextLine(); 
	      Iterator<Entry<Author, List<Book>>>iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
       	       Entry<Author, List<Book>> map = iterator.next();
       	         if(map.getKey().equals(nameOrSurename)){
       	            Iterator<Book>iter = map.getValue().iterator();  
       	              while (iter.hasNext()) {
     		            Book book = iter.next();
       			          iter.remove();
                     }
                }
   }
             System.out.println(map);
             
   
   }

}
