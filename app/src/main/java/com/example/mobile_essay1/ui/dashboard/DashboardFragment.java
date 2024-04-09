package com.example.mobile_essay1.ui.dashboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.mobile_essay1.R;
import com.example.mobile_essay1.databinding.FragmentDashboardBinding;
import com.example.mobile_essay1.adapters.Adaptador;
import com.example.mobile_essay1.R.drawable;

public class DashboardFragment extends Fragment {
    private FragmentDashboardBinding binding;
    private MediaPlayer mediaPlayer;

    private String[] musicNames= {"musica0", "musica1", "musica2", "musica3", "musica4", "musica5"};

    private String[] musicNamesRelax = {"musica0", "musica1", "musica2", "musica3", "musica4", "musica5"};
    private String[] musicNamesPop = {"musica6", "musica7", "musica8", "musica9", "musica10", "musica11"};

    private String[] musicNamesRock = {"musica12", "musica13", "musica14", "musica15", "musica16", "musica17"};
    private String[] musicNamesBrasileira = {"musica18", "musica19", "musica20", "musica21", "musica22", "musica23"};

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        //inicializar style como Relax
        binding = FragmentDashboardBinding.inflate(inflater, container, false);

        int[] list = new int[] {
                drawable.sample_0, drawable.sample_1, drawable.sample_2,
                drawable.sample_3, drawable.sample_4, drawable.sample_5};
        binding.grid1.setAdapter(new Adaptador(getContext(), list));

        binding.grid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String selected_music = musicNames[position];

                // Faça o que precisar com o nome da música selecionada
                Bundle bundle = new Bundle();
                bundle.putString("selected_music", selected_music);
                NavController nav = NavHostFragment.findNavController(DashboardFragment.this);
                nav.popBackStack();
                nav.navigate(R.id.action_navigation_dashboard_to_navigation_player, bundle);
            }
        });

        ArrayAdapter adapter = ArrayAdapter.createFromResource(getContext(),
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
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int[] newList;
                switch (position) {
                    case 1:
                        musicNames = musicNamesRelax;
                        newList = new int[]{R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_2,
                                R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_5};
                        break;
                    case 2:
                        musicNames = musicNamesPop;
                        newList = new int[]{R.drawable.sample_6, R.drawable.sample_7, R.drawable.sample_8,
                                R.drawable.sample_9, R.drawable.sample_10, R.drawable.sample_11};
                        break;
                    case 3:
                        musicNames = musicNamesRock;
                        newList = new int[]{R.drawable.sample_12, R.drawable.sample_14, R.drawable.sample_15,
                                R.drawable.sample_15, R.drawable.sample_16, R.drawable.sample_17};
                        break;
                    case 4:
                        musicNames = musicNamesBrasileira;
                        newList = new int[]{R.drawable.sample_18, R.drawable.sample_19, R.drawable.sample_20,
                                R.drawable.sample_21, R.drawable.sample_22, R.drawable.sample_23};
                        break;
                    default:
                        musicNames = musicNamesRelax;
                        newList = new int[]{R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_2,
                                R.drawable.sample_3, R.drawable.sample_4, R.drawable.sample_5};
                        break;
                }
                binding.grid1.setAdapter(new Adaptador(getContext(), newList));
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
