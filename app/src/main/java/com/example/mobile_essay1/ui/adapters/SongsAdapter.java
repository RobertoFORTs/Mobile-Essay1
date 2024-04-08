package com.example.mobile_essay1.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.mobile_essay1.R;

import java.util.List;

public class SongsAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> mSongNames;

    @Override
    public int getCount() {
        return mSongNames.size();
    }

    @Override
    public Object getItem(int position) {
        return mSongNames.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.song_layout, null);
        }

        TextView textViewSongName = view.findViewById(R.id.text_view_song_name);
        Button buttonPlay = view.findViewById(R.id.button_play);

        textViewSongName.setText(mSongNames.get(position));
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        return view;
    }
}
