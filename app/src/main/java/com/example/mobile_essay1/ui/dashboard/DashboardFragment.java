package com.example.mobile_essay1.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mobile_essay1.R;
import com.example.mobile_essay1.databinding.FragmentDashboardBinding;

import java.util.ArrayList;
import java.util.List;
import com.example.mobile_essay1.ui.adapters.*;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;
    private GridView mGridView;
    private SongsAdapter mSongsAdapter;
    private List<String> mSongNames;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mSongNames = new ArrayList<>();
        mGridView = root.findViewById(R.id.grid_view_songs);
        mSongsAdapter = new SongsAdapter(requireContext(), mSongNames);
        mGridView.setAdapter(mSongsAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}