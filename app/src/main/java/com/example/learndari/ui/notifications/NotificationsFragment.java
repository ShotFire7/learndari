package com.example.learndari.ui.notifications;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.learndari.R;
import com.example.learndari.databinding.FragmentNotificationsBinding;
import com.example.learndari.ui.dashboard.GlobalS;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        

        final TextView textView = binding.textNotifications;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        Spinner dropdown = (Spinner) root.findViewById(R.id.spinner1);
        String[] items = new String[]{"System Theme", "Dark", "Light"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                if (dropdown.getSelectedItem().toString().equals("Dark")) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else if (dropdown.getSelectedItem().toString().equals("Light")) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                } else if (dropdown.getSelectedItem().toString().equals("System Theme")) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
            }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
            }

        });



        Spinner dropdown2 = (Spinner) root.findViewById(R.id.spinner2);
        String[] items2 = new String[]{"Black", "Red", "Blue", "Green", "Magenta"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown2.setAdapter(adapter2);
        dropdown2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                if (dropdown2.getSelectedItem().toString().equals("Black")) {
                    GlobalS.drawColor = Color.BLACK;
                } else if (dropdown2.getSelectedItem().toString().equals("Red")) {
                    GlobalS.drawColor = Color.RED;
                } else if (dropdown2.getSelectedItem().toString().equals("Blue")) {
                    GlobalS.drawColor = Color.BLUE;
                } else if (dropdown2.getSelectedItem().toString().equals("Green")) {
                    GlobalS.drawColor = Color.GREEN;
                } else if (dropdown2.getSelectedItem().toString().equals("Magenta")) {
                    GlobalS.drawColor = Color.MAGENTA;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                GlobalS.drawColor = Color.BLACK;
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