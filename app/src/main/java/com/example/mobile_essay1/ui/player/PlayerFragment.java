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
        String selected_music = "";
        final TextView textView = binding.textPlayer;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        tvTime = root.findViewById(R.id.tvTimeStart);
        tvDuration = root.findViewById(R.id.tvTimeEnd);
        seekbarTime = root.findViewById(R.id.seekBarTime);
        btnPlay = root.findViewById(R.id.btnPlay);
        btnPlay.setBackgroundResource(R.drawable.ic_pause);
        if (musicPlayer == null){
            seekbarTime.setProgress(0);
            tvDuration.setText("--");

        }
        String duration = "00:00";
        if (getArguments() != null) {
            selected_music = getArguments().getString("selected_music");
            System.out.println(selected_music);
        }

        switch (selected_music){
            case "musica0":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica0);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;

            case "musica1":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica1);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;

            case "musica2":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica2);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica3":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica3);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica4":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica4);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica5":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica5);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica6":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica6);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica7":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica7);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica8":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica8);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica9":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica9);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica10":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica10);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica11":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica11);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica12":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica12);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica13":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica13);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica14":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica14);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica15":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica15);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica16":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica16);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica17":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica17);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica18":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica18);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica19":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica19);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica20":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica20);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica21":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica21);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica22":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica22);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;
            case "musica23":
                System.out.println(selected_music);
                musicPlayer = MediaPlayer.create(getContext(), R.raw.musica23);
                musicPlayer.start();
                duration = millisecondsToString( musicPlayer.getDuration());
                break;

        }
        tvDuration.setText(duration);
        if (musicPlayer!=null){
            seekbarTime.setMax(musicPlayer.getDuration());
        }
        seekbarTime.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean isFromUser) {
                if (isFromUser) {
                    musicPlayer.seekTo(progress);
                    seekBar.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (musicPlayer != null) {
                    if (musicPlayer.isPlaying()){
                        try {
                            final double current = musicPlayer.getCurrentPosition();
                            double duration = musicPlayer.getDuration();
                            final double position = (100.0/duration) * current;
                            final String elapsedTime = millisecondsToString((int)current);

                            if (isAdded() && getActivity() != null) {
                                requireActivity().runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        tvTime.setText(elapsedTime);
                                        seekbarTime.setProgress((int) current);
                                    }
                                });
                            }
                            Thread.sleep(1000);
                        }catch(InterruptedException e) {

                        }
                    }
                }
            }
        }).start();

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

    public String millisecondsToString (int time){
        String elapsedTime = "";
        int minutes = time/ 1000 / 60;
        int seconds  = time / 1000 % 60;
        elapsedTime = minutes +":";
        if (seconds < 10){
            elapsedTime += "0";
        }
        elapsedTime += seconds;
        return elapsedTime;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}