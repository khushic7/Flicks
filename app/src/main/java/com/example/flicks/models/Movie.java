package com.example.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel // annotation indicates the class is Parcelable
public class Movie {

    // values from API
    String title;
    String overview;
    String posterPath; // only the path
    String bgImagePath; // only the path
    Double voteAverage;

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBgImagePath() {
        return bgImagePath;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    // initialize from JSON data
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        bgImagePath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
    }

    // no-arg empty constructor required for Parcelable
    public Movie () {}
}
