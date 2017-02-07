package com.yapps.activityswitcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by salimatti on 7/30/2016.
 */
public class CardStackViewExample extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_stack_view);
        LayoutInflater inflater = LayoutInflater.from(this);

        MyCardStackView sv = (MyCardStackView)findViewById(R.id.my_stack_view);
        sv.setOrientation(SwipeTouchListener.Orientation.Vertical);
        sv.setAdapter(new CardAdapter());
        View emptyView = inflater.inflate(R.layout.empty_page, null);
        sv.setEmptyView(emptyView);
    }
}


