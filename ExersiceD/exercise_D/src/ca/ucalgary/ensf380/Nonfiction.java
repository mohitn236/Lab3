//package ca.ucalgary.ensf380;
//
//public class Nonfiction extends Book {
//    private Category deweyClassification;
//
//    public Nonfiction(String isbn, int publicationYear, int pages, Category deweyClassification) {
//        super(isbn, publicationYear, pages);
//        this.deweyClassification = deweyClassification;
//    }
//
//    public Category getDeweyClassification() {
//        return deweyClassification;
//    }
//
//    public void setDeweyClassification(Category deweyClassification) {
//        this.deweyClassification = deweyClassification;
//    }
//
//    public String getDeweyClassificationString() {
//        return "Method getDeweyClassification called from Nonfiction";
//    }
//
//    public void setDeweyClassification(Category cat) {
//        this.deweyClassification = cat;
//    }
//}

package ca.ucalgary.ensf380;

public class Nonfiction extends Book {
    private Category deweyClassification;

    public Nonfiction(String isbn, int publicationYear, int pages, Category deweyClassification) {
        super(isbn, publicationYear, pages);
        this.deweyClassification = deweyClassification;
    }

    public Category getDeweyClassification() {
        return deweyClassification;
    }

    public void setDeweyClassification(Category deweyClassification) {
        this.deweyClassification = deweyClassification;
    }
}



