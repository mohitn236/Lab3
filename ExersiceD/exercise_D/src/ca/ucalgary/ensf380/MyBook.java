package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "London, UK", "55");
        Publisher[] publishers = {new Publisher("Bloomsbury", "London, UK", "Fantasy")};

        Classic classicBook = new Classic("978-3-16-148410-0", 2007, 336, "Hardcover", 1860, author, publishers);

        System.out.println("Book ISBN: " + classicBook.getIsbn());
        System.out.println("Publication Year: " + classicBook.getPublicationYear());
        System.out.println("Pages: " + classicBook.getPages());
        System.out.println("Binding: " + classicBook.getBinding());
        System.out.println("Original Publication Year: " + classicBook.getOrigPubYear());
        System.out.println("Author: " + classicBook.getTheAuthor().getName());
        System.out.println("Publisher: " + classicBook.getBookPublisher()[0].getName());
        System.out.println(classicBook.createNotes());
    }
}


