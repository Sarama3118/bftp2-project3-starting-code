package net.filmcity.app.domain;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String coverImage;
    private String director;
    private int year;
    private String genre;
    @Lob
    private String synopsis;
    private boolean booked;
    private String customerName;
    private int rating;

    public Movie() {
    }

    public Movie(String title, String coverImage, String director, int year, String synopsis) {
        this.title = title;
        this.coverImage = coverImage;
        this.director = director;
        this.year = year;
        this.synopsis = synopsis;
    }

    public Movie(String title, String coverImage, String director, int year, String genre, String synopsis) {
        this.title = title;
        this.coverImage = coverImage;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public Movie(String title, String coverImage, String director, int year, String genre, String synopsis, Boolean booked, String customerName, int rating) {
        this.title = title;
        this.coverImage = coverImage;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.synopsis = synopsis;
        this.booked = booked;
        this.customerName = customerName;
        this.rating = rating;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Boolean getBooked() {
        if (booked) {
            return true;
        } else {
            return false;
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getRating() {
        if (rating == 0) {
            return "Sin valorar";
        }
        else if  (rating <= 5) {
            return String.valueOf(rating);
        }

        else {
            return "5";
        }
    }
}
