package com.example.mobile_essay1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.mobile_essay1.adapters.AdaptadorListView;
import com.example.mobile_essay1.ItemListView;
import com.example.mobile_essay1.R;
import com.example.mobile_essay1.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        List<ItemListView> itens=new ArrayList<>();
        itens.add(0,new ItemListView(R.drawable.sample_0,"Relax"));
        itens.add(1,new ItemListView(R.drawable.sample_6,"Pop"));
        itens.add(2,new ItemListView(R.drawable.sample_12,"Rock"));
        itens.add(3,new ItemListView(R.drawable.sample_18,"Brasileira"));

        binding.list1.setAdapter(new AdaptadorListView(getContext(),itens));



        binding.btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController navController = NavHostFragment.findNavController(HomeFragment.this);
                navController.popBackStack();
                navController.navigate(R.id.action_homeFragment_to_dashboardFragment);
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
