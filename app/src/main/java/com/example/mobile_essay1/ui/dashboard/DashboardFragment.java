package com.example.mobile_essay1.ui.dashboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.mobile_essay1.R;
import com.example.mobile_essay1.databinding.FragmentDashboardBinding;

import java.util.ArrayList;
import java.util.List;
import com.example.mobile_essay1.ui.adapters.*;
import com.example.mobile_essay1.ui.home.HomeFragment;

public class DashboardFragment extends Fragment {
    private FragmentDashboardBinding binding;
    private MediaPlayer mediaPlayer;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getContext(),
                R.array.sons, android.R.layout.simple_spinner_item);
        binding.spinner1.setAdapter(adapter);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(DashboardFragment.this)
                        .navigate(R.id.action_dashboardFragment_to_action_homeFragment);
            }
        });
        binding.spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if(mediaPlayer!=null){
                    mediaPlayer.release();
                }
                switch (position){
                    case 1:
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.musica1);
                        mediaPlayer.start();
                        break;
                    case 2:
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.musica2);
                        mediaPlayer.start();
                        break;
                    case 3:
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.musica3);
                        mediaPlayer.start();
                        break;
                    case 4:
                        mediaPlayer=MediaPlayer.create(getContext(),R.raw.musica4);
                        mediaPlayer.start();
                        break;
                }
                if(mediaPlayer!=null){
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mediaPlayer.release();
                        }
                    });
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
