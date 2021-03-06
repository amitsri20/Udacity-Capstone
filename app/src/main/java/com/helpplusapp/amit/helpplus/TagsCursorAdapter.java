package com.helpplusapp.amit.helpplus;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by amit on 8/31/2016.
 */
public class TagsCursorAdapter extends CursorAdapter {
    public TagsCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    // The newView method is used to inflate a new view and return it,
    // you don't bind any data to the view at this point.
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.arch_tags_item, parent, false);
    }

    // The bindView method is used to bind all data to a given view
    // such as setting the text on a TextView.
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Find fields to populate in inflated template
        TextView tagname = (TextView) view.findViewById(R.id.tag_name);
//        TextView datecreated = (TextView) view.findViewById(R.id.tag_created_date);
        // Extract properties from cursor
        String tagName = cursor.getString(cursor.getColumnIndexOrThrow("tagname"));
//        String dateCreated = cursor.getString(cursor.getColumnIndexOrThrow("timecreated"));
        // Populate fields with extracted properties
        tagname.setText(tagName);
//        datecreated.setText(dateCreated);
    }
}