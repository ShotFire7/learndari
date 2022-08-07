package com.example.learndari.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.learndari.R;
import com.example.learndari.databinding.FragmentHomeBinding;
import com.example.learndari.ui.dashboard.DashboardFragment;
import com.example.learndari.ui.dashboard.GlobalS;
import com.example.learndari.ui.dashboard.MainActivity3;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        Button button347 = (Button) root.findViewById(R.id.button2);
        Button button38 = (Button) root.findViewById(R.id.button38);
        Button button40 = (Button) root.findViewById(R.id.button40);
        Button button41 = (Button) root.findViewById(R.id.button41);
        Button button42 = (Button) root.findViewById(R.id.button42);
        Button button43 = (Button) root.findViewById(R.id.button43);
        Button button44 = (Button) root.findViewById(R.id.button44);
        Button button45 = (Button) root.findViewById(R.id.button45);
        Button button46 = (Button) root.findViewById(R.id.button46);
        Button button47 = (Button) root.findViewById(R.id.button47);
        Button button48 = (Button) root.findViewById(R.id.button48);
        Button button49 = (Button) root.findViewById(R.id.button49);
        Button button50 = (Button) root.findViewById(R.id.button50);
        Button button51 = (Button) root.findViewById(R.id.button51);
        Button button52 = (Button) root.findViewById(R.id.button52);
        Button button53 = (Button) root.findViewById(R.id.button53);
        Button button54 = (Button) root.findViewById(R.id.button54);
        Button button55 = (Button) root.findViewById(R.id.button55);
        Button button56 = (Button) root.findViewById(R.id.button56);
        Button button57 = (Button) root.findViewById(R.id.button57);
        Button button58 = (Button) root.findViewById(R.id.button58);
        Button button59 = (Button) root.findViewById(R.id.button59);
        Button button60 = (Button) root.findViewById(R.id.button60);
        Button button61 = (Button) root.findViewById(R.id.button61);
        Button button62 = (Button) root.findViewById(R.id.button62);
        Button button63 = (Button) root.findViewById(R.id.button63);
        Button button64 = (Button) root.findViewById(R.id.button64);
        Button button65 = (Button) root.findViewById(R.id.button65);
        Button button66 = (Button) root.findViewById(R.id.button66);
        Button button67 = (Button) root.findViewById(R.id.button67);
        Button button68 = (Button) root.findViewById(R.id.button68);
        Button button7 = (Button) root.findViewById(R.id.button7);
        button347.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 1;
                changeScreen();
            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 2;
                changeScreen();
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 3;
                changeScreen();
            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 4;
                changeScreen();
            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 5;
                changeScreen();
            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 6;
                changeScreen();
            }
        });
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 7;
                changeScreen();
            }
        });
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 8;
                changeScreen();
            }
        });
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 9;
                changeScreen();
            }
        });
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 10;
                changeScreen();
            }
        });
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 11;
                changeScreen();
            }
        });
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 12;
                changeScreen();
            }
        });
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 13;
                changeScreen();
            }
        });
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 14;
                changeScreen();
            }
        });
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 15;
                changeScreen();
            }
        });
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 16;
                changeScreen();
            }
        });
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 17;
                changeScreen();
            }
        });
        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 18;
                changeScreen();
            }
        });
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 19;
                changeScreen();
            }
        });
        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 20;
                changeScreen();
            }
        });
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 21;
                changeScreen();
            }
        });
        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 22;
                changeScreen();
            }
        });
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 23;
                changeScreen();
            }
        });
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 24;
                changeScreen();
            }
        });
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 25;
                changeScreen();
            }
        });
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 26;
                changeScreen();
            }
        });
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 27;
                changeScreen();
            }
        });
        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 28;
                changeScreen();
            }
        });
        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 29;
                changeScreen();
            }
        });
        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 30;
                changeScreen();
            }
        });
        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 31;
                changeScreen();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 32;
                changeScreen();
            }
        });
        return root;

    }

    public void changeScreen() {
        Intent intent = new Intent(HomeFragment.this.getActivity(), MainActivity3.class);
        startActivity(intent);
        MainActivity3 mainActivity3 = new MainActivity3();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}