package com.example.mobile_essay1.ui.player;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mobile_essay1.R;
import com.example.mobile_essay1.databinding.FragmentPlayerBinding;
import com.example.mobile_essay1.ui.dashboard.DashboardFragment;
import com.example.mobile_essay1.interfaces.OnMusicSelectedListener;

public class PlayerFragment extends Fragment {

    private FragmentPlayerBinding binding;
    private TextView tvTime, tvDuration;
    private SeekBar seekbarTime;
    private Button btnPlay;

    private MediaPlayer musicPlayer;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PlayerViewModel notificationsViewModel =
                new ViewModelProvider(this).get(PlayerViewModel.class);

        binding = FragmentPlayerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPlayer;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        tvTime = root.findViewById(R.id.tvTimeStart);
        tvDuration = root.findViewById(R.id.tvTimeEnd);
        seekbarTime = root.findViewById(R.id.seekBarTime);
        btnPlay = root.findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (musicPlayer != null) {
                    if (musicPlayer.isPlaying()) {
                        musicPlayer.pause();
                        btnPlay.setBackgroundResource(R.drawable.ic_player);
                    } else {
                        musicPlayer.start();
                        btnPlay.setBackgroundResource(R.drawable.ic_pause);
                    }
                }
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}