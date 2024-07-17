package ca.ucalgary.ensf380;

public class Novel extends Fiction {
    private Author[] theAuthors;
    private Series mySeries;

    public Novel(String isbn, int publicationYear, int pages, String coverArt, String genre, Author[] theAuthors, Series mySeries) {
        super(isbn, publicationYear, pages, coverArt, genre);
        this.theAuthors = theAuthors;
        this.mySeries = mySeries;
    }

    public Author[] getTheAuthors() {
        return theAuthors;
    }

    public void setTheAuthors(Author[] theAuthors) {
        this.theAuthors = theAuthors;
    }

    public Series getMySeries() {
        return mySeries;
    }

    public void setMySeries(Series mySeries) {
    	this.mySeries = mySeries;
    	}
    }
