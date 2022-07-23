package com.example.learndari.ui.home;

<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> 9401af2 (new update)
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
=======
import android.widget.Button;
>>>>>>> 9401af2 (new update)
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

<<<<<<< HEAD
import com.example.learndari.databinding.FragmentHomeBinding;
=======
import com.example.learndari.R;
import com.example.learndari.databinding.FragmentHomeBinding;
import com.example.learndari.ui.dashboard.DashboardFragment;
import com.example.learndari.ui.dashboard.GlobalS;
import com.example.learndari.ui.dashboard.MainActivity3;
>>>>>>> 9401af2 (new update)

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
<<<<<<< HEAD
        return root;
    }

=======
        Button button347 = (Button) root.findViewById(R.id.button2);
        button347.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.lessonNumber = 1;
                changeScreen();
                MainActivity3 mainActivity3 = new MainActivity3(); //sssssssssssss
            }
        });
        return root;
    }

    public void changeScreen() {
        Intent intent = new Intent(HomeFragment.this.getActivity(), MainActivity3.class); //arsssssssssssstarstarst
        startActivity(intent);
    }

>>>>>>> 9401af2 (new update)
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}