package com.example.android.newsapp;

public class Article {

    private String mTitle;
    private String mCategory;
    private String mDate;
    private String mAuthor;
    private String mUrl;

    /**
     * Constructs a new {@link Article} object.
     *
     * @param title of the article
     * @param category
     * @param date
     * @param author
     * @param url is the website URL to find more details
     */
    public Article(String title, String category, String date, String author, String url) {
        mTitle = title;
        mCategory = category;
        mDate = date;
        mAuthor = author;
        mUrl = url;
    }

    // Since these global variables are private, we need to create public Getter Methods so that
    // other classes can access these information
    public String getTitle() {
        return mTitle;
    }

    public String getCategory() {
        return mCategory;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find more information
     */
    public String getUrl() {
        return mUrl;
    }
}
