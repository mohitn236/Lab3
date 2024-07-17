package ca.ucalgary.ensf380;

public class Paperback extends Book {
    private String coverArt;

    public Paperback(String isbn, int publicationYear, int pages, String coverArt) {
        super(isbn, publicationYear, pages);
        this.coverArt = coverArt;
    }

    public String getCoverArt() {
        return coverArt;
    }

    public void setCoverArt(String coverArt) {
        this.coverArt = coverArt;
    }
}
