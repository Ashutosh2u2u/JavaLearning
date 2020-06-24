package sortingPrac;

public class Book implements Comparable<Book> {
	
	private String authorName;
	private String booktitle;
	private int numPages;
	
	public Book(){		
	}
	
	public Book(String authorName, String booktitle, int numPages) {
		super();
		this.authorName = authorName;
		this.booktitle = booktitle;
		this.numPages = numPages;
	}

	
    public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public String getBooktitle() {
		return booktitle;
	}


	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}


	public int getNumPages() {
		return numPages;
	}


	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	//Alt+Shift+S+V  shortcut key for override
	@Override
	public String toString() {		
		return this.authorName+" "+this.booktitle +" "+this.numPages;
	}
	
	//implementation of comparable

	@Override
	public int compareTo(Book otherBook) {
		if(this.numPages>otherBook.getNumPages()) return +1;  //for decending order jst use -ve sign
		if(this.numPages==otherBook.getNumPages()) return 0;
		else
			return -1;
		
		//return this.authorName.compareTo(otherBook.getAuthorName());
		//return this.booktitle.compareTo(otherBook.getBooktitle());
		//return Integer.compare(numPages, otherBook.getNumPages());
	}

 
}
