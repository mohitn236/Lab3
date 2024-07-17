package ca.ucalgary.ensf380;

public class Classic extends Hardcover {
    private int origPubYear;
    private Author theAuthor;
    private Publisher[] bookPublisher;

    public Classic(String isbn, int publicationYear, int pages, String binding, int origPubYear, Author theAuthor, Publisher[] bookPublisher) {
        super(isbn, publicationYear, pages, binding);
        this.origPubYear = origPubYear;
        this.theAuthor = theAuthor;
        this.bookPublisher = bookPublisher;
    }

    public int getOrigPubYear() {
        return origPubYear;
    }

    public void setOrigPubYear(int origPubYear) {
        this.origPubYear = origPubYear;
    }

    public Author getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author theAuthor) {
        this.theAuthor = theAuthor;
    }

    public Publisher[] getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(Publisher[] bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String createNotes() {
        return "Method createNotes called from Classic";
    }

    public String getOrigPubYear(int i) {
        return "Method getOrigPubYear called from Classic";
    }
}
