package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    private String storyOrder;
    private Story[] stories;

    public Anthology(String isbn, int publicationYear, int pages, String coverArt, String genre, String storyOrder, Story[] stories) {
        super(isbn, publicationYear, pages, coverArt, genre);
        this.storyOrder = storyOrder;
        this.stories = stories;
    }

    public String getStoryOrder() {
        return storyOrder;
    }

    public void setStoryOrder(String storyOrder) {
        this.storyOrder = storyOrder;
    }

    public Story[] getStories() {
        return stories;
    }

    public void setStories(Story[] stories) {
        this.stories = stories;
    }
}
