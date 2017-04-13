package catalog;

import java.util.Comparator;

public class SortByYearOfPublishing implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getYearOfPublishing()-o2.getYearOfPublishing();
	}

}
