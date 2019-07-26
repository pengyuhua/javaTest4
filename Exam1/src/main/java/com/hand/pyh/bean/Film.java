package com.hand.pyh.bean;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Enumeration;

public class Film {


//    @NotNull
    private Integer film_id;
    @NotNull
    private String title;
    private String description;
    private Date release_year;
    @NotNull
    private Integer language_id;
    private Integer original_language_id;
    @NotNull
    private Integer rental_duration;
    @NotNull
    private Double rental_rate;
    private Integer length;
    @NotNull
    private Double replacement_cost;

    private Enumeration rating;  // enum 类型数据

    private Object special_features;  //Set 类型数据
//    @NotNull
    private Date last_update;  //Timestamp 类型数据

    public Film(@NotNull String title, @NotNull Integer language_id, @NotNull Integer rental_duration, Double rental_rate, Double replacement_cost) {
        this.title = title;
        this.language_id = language_id;
        this.rental_duration = rental_duration;
        this.rental_rate = rental_rate;
        this.replacement_cost = replacement_cost;
    }

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Date release_year) {
        this.release_year = release_year;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public Integer getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(Integer original_language_id) {
        this.original_language_id = original_language_id;
    }

    public Integer getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(Integer rental_duration) {
        this.rental_duration = rental_duration;
    }

    public @NotNull Double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(Double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public @NotNull Double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(@NotNull Double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public Enumeration getRating() {
        return rating;
    }

    public void setRating(Enumeration rating) {
        this.rating = rating;
    }

    public Object getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(Object special_features) {
        this.special_features = special_features;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "Film{" +
                "film_id=" + film_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", release_year=" + release_year +
                ", language_id=" + language_id +
                ", original_language_id=" + original_language_id +
                ", rental_duration=" + rental_duration +
                ", rental_rate=" + rental_rate +
                ", length=" + length +
                ", replacement_cost=" + replacement_cost +
                ", rating=" + rating +
                ", special_features=" + special_features +
                ", last_update=" + last_update +
                '}';
    }
}
