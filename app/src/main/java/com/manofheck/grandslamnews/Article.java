package com.manofheck.grandslamnews;

public class Article {
    /** publication date of the article **/
    private String mPublicationDate;

    /** Title of the article **/
    private String mTitle;

    /** Contributor of the article **/
    private String mContributor;

    /** Website URL of the article **/
    private String mURL;


    /**
     * Constructs a new {@link Article} object.
     *
     * @param publicationDate is the publication date of the article
     * @param title is the Title the article
     * @param url is the website URL to find more details about the article
     * @param contributor is the contributor of the article
     */
    public Article(String publicationDate, String title, String contributor, String url) {
        mPublicationDate = publicationDate;
        mTitle = title;
        mContributor = contributor;
        mURL = url;
    }

    /**
     * Returns the publication of the article.
     */
    public String getPublicationDate() {
        return mPublicationDate;
    }

    /**
     * Returns the Title of the article.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the Contributor of the article.
     */
    public String getContributor() { return mContributor; }


    /**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() {
        return mURL;
    }


}
