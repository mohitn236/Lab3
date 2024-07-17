package ca.ucalgary.ensf380;

public class Story {
    private Author[] theAuthors;
    private String plot;

    public Story(Author[] theAuthors, String plot) {
        this.theAuthors = theAuthors;
        this.plot = plot;
    }

    public Author[] getTheAuthors() {
        return theAuthors;
    }

    public void setTheAuthors(Author[] theAuthors) {
        this.theAuthors = theAuthors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }
}
