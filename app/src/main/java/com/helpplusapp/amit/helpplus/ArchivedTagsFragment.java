package com.helpplusapp.amit.helpplus;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.helpplusapp.amit.helpplus.datahelpler.HelpPlusDBTableTable;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArchivedTagsFragment extends Fragment {


    public ArchivedTagsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_archived_tags, container, false);
        ListView lvItems = (ListView)root.findViewById(R.id.tagslistView);
// Setup cursor adapter using cursor from last step

        Cursor tagsCursor = getContext().getContentResolver().query(HelpPlusDBTableTable.CONTENT_URI, null, null, null, null);
//        tagsCursor.moveToFirst();
        TagsCursorAdapter tagsAdapter = new TagsCursorAdapter(getContext(),tagsCursor);
// Attach cursor adapter to the ListView
        lvItems.setAdapter(tagsAdapter);
        return root;
    }

}
