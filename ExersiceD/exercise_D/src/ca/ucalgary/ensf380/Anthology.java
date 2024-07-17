package ca.ucalgary.ensf380;

public class Anthology {
    private String storyOrder;
    private Story[] stories;

    public Anthology(String storyOrder, Story[] stories) {
        this.storyOrder = storyOrder;
        this.stories = stories;
    }


    public String getStoryOrder() {
        return storyOrder;
    }

    public void setStoryOrder(String order) {
        this.storyOrder = order;
    }

    public Story[] getStories() {
        return stories;
    }

    public void setStories(Story[] stories) {
        this.stories = stories;
    }
}
