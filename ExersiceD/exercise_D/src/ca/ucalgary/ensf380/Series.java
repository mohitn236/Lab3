package ca.ucalgary.ensf380;

public class Series {
    private String seriesName;
    private String theme;

    public Series(String seriesName, String theme) {
        this.seriesName = seriesName;
        this.theme = theme;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
