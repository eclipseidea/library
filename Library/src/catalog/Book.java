package catalog;

public class Book {
	private String nameOfBook;
	private int yearOfPublishing;
	private int numberOfPages;

	public Book(String nameOfBook, int yearOfPublishing, int numberOfPages) {
		super();
		this.nameOfBook = nameOfBook;
		this.yearOfPublishing = yearOfPublishing;
		this.numberOfPages = numberOfPages;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nameOfBook == null) ? 0 : nameOfBook.hashCode());
		result = prime * result + numberOfPages;
		result = prime * result + yearOfPublishing;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (nameOfBook == null) {
			if (other.nameOfBook != null)
				return false;
		} else if (!nameOfBook.equals(other.nameOfBook))
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (yearOfPublishing != other.yearOfPublishing)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "{nameOfBook=" + nameOfBook + ", yearOfPublishing="
				+ yearOfPublishing + ", numberOfPages=" + numberOfPages + "}";
	}
}
