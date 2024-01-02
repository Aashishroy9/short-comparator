public class Movie {
    private String name;
    private int year;
    private int rating;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    public Movie(String name, int year, int rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;


    }
}
