package com.example.learndari.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.learndari.R;
import com.example.learndari.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        Button btn1 = (Button) root.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CREATION","joisarentarositnariost");
                GlobalS.chosenLetter = "alef";
                GlobalS.drawLetter = "alef";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });

        //find how to put functions in fragments
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;




    }


    public void changeScreen() {
        Intent intent = new Intent(DashboardFragment.this.getActivity(), MainActivity2.class);
        startActivity(intent);
    }
}

