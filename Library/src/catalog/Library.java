package catalog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

public class Library {
    Map<Author, List<Book>> map=new HashMap<>();
    
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
   }
  
   public void delettAllBooksFromAuthor(){
	   Author_main.info();
	   String nameOrSurename= Author_main.scanner.nextLine(); 
	      Iterator<Entry<Author, List<Book>>>iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
       	       Entry<Author, List<Book>> map = iterator.next();
       	         if(map.getKey().getName().equalsIgnoreCase(nameOrSurename)||map.getKey().getSurname().equalsIgnoreCase(nameOrSurename)){
       	        	map.getValue().clear();  
   
                }
            }
   }

   public void sortByNumberOfPage(){
	   Author_main.info();
	   String nameOrSurename= Author_main.scanner.nextLine(); 
	   Iterator<Entry<Author, List<Book>>>iterator = map.entrySet().iterator();
       while (iterator.hasNext()) {
 	       Entry<Author, List<Book>> map = iterator.next();
 	         if(map.getKey().getName().equalsIgnoreCase(nameOrSurename)||map.getKey().getSurname().equalsIgnoreCase(nameOrSurename)){
 	        	 Collections.sort(map.getValue(),new SortByNumberOfPage());  
 	         }
       }
  }

   public void SortByYearOfPublishing(){
	   Author_main.info();
	   String nameOrSurename= Author_main.scanner.nextLine(); 
	   Iterator<Entry<Author, List<Book>>>iterator = map.entrySet().iterator();
       while (iterator.hasNext()) {
 	       Entry<Author, List<Book>> map = iterator.next();
 	         if(map.getKey().getName().equalsIgnoreCase(nameOrSurename)||map.getKey().getSurname().equalsIgnoreCase(nameOrSurename)){
 	        	 Collections.sort(map.getValue(),new SortByYearOfPublishing());  
 	         }
       }
  }

  public void showAllLibrary(){
	     for (Map.Entry<Author, List<Book>> mep: map.entrySet()) {
			System.out.println("Author "+mep.getKey().getName()+" "+mep.getKey().getSurname()+" have got:" );
		     for (int i = 0; i < mep.getValue().size(); i++) {
		    	 System.out.println(mep.getValue().get(i));
			}
  	    }
  }
  
}