
package ca.ucalgary.ensf380;

public class Book {
    private String isbn;
    private int publicationYear;
    private int pages;

    public Book(String isbn, int publicationYear, int pages) {
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}


