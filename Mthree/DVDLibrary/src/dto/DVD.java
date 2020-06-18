package dto;

public class DVD {

    private String title;
    private String releaseDate;
    private String mppaRating;
    // Programming Language + cohort month/year
    private String directorsName;
    private String studio;
    private String userRating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public DVD(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMppaRating() {
        return mppaRating;
    }

    public void setMppaRating(String mppaRating) {
        this.mppaRating = mppaRating;
    }

    public String getDirectorsName() {
        return directorsName;
    }

    public void setDirectorsName(String directorsName) {
        this.directorsName = directorsName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }
}
