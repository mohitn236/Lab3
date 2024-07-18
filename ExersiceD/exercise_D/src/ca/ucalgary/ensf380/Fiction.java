package ca.ucalgary.ensf380;

public class Fiction extends Book {
    private String coverArt;
    private String genre;

    public Fiction(String isbn, int publicationYear, int pages, String coverArt, String genre) {
        super(isbn, publicationYear, pages);
        this.coverArt = coverArt;
        this.genre = genre;
    }

    public String getCoverArt() {
        return coverArt;
    }

    public void setCoverArt(String coverArt) {
        this.coverArt = coverArt;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
