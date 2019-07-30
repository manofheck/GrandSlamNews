package com.manofheck.grandslamnews;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article>{


    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list item view that displays information about the news story at the given position
     * in the list of articles.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }

        // Find the article at the given position in the list of articles
        Article currentArticle = getItem(position);


        // Find the TextView with view ID webTitle
        TextView titleView = (TextView) listItemView.findViewById(R.id.webTitle);
        // Display the Title of the current artile in that TextView
        titleView.setText(currentArticle.getTitle());

        // Find the TextView with view ID contributor
        TextView contributorView = (TextView) listItemView.findViewById(R.id.contributor);
        // Display the contributor of the current article in that TextView
        contributorView.setText(currentArticle.getContributor());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Display the date of the current article in that TextView
        String tempDate = currentArticle.getPublicationDate().substring(0,10);
        dateView.setText(tempDate.substring(0,10));

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}
