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
<<<<<<< HEAD
        Button btn2 = (Button) root.findViewById(R.id.btn2);
        Button btn7 = (Button) root.findViewById(R.id.btn7);
        Button btn9 = (Button) root.findViewById(R.id.btn9);
        Button btn10 = (Button) root.findViewById(R.id.btn10);
        Button btn11 = (Button) root.findViewById(R.id.btn11);
        Button btn12 = (Button) root.findViewById(R.id.btn12);
        Button btn13 = (Button) root.findViewById(R.id.btn13);
        Button btn14 = (Button) root.findViewById(R.id.btn14);
        Button btn20 = (Button) root.findViewById(R.id.btn20);
        Button btn21 = (Button) root.findViewById(R.id.btn21);
        Button btn22 = (Button) root.findViewById(R.id.btn22);
        Button btn23 = (Button) root.findViewById(R.id.btn23);
        Button btn24 = (Button) root.findViewById(R.id.btn24);
        Button btn25 = (Button) root.findViewById(R.id.btn25);
        Button btn55 = (Button) root.findViewById(R.id.btn55);
        Button btn56 = (Button) root.findViewById(R.id.btn56);
        Button btn57 = (Button) root.findViewById(R.id.btn57);
        Button btn63 = (Button) root.findViewById(R.id.btn63);
        Button btn61 = (Button) root.findViewById(R.id.btn61);
        Button btn62 = (Button) root.findViewById(R.id.btn62);
        Button btn66 = (Button) root.findViewById(R.id.btn66);
        Button btn64 = (Button) root.findViewById(R.id.btn64);
        Button btn65 = (Button) root.findViewById(R.id.btn65);
        Button btn69 = (Button) root.findViewById(R.id.btn69);
        Button btn67 = (Button) root.findViewById(R.id.btn67);
        Button btn68 = (Button) root.findViewById(R.id.btn68);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
=======
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CREATION","joisarentarositnariost");
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
                GlobalS.chosenLetter = "alef";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
<<<<<<< HEAD
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "be";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "pe";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        }); //Left off here -- note to self: clear all constraints and redo them on activity_main1, and then get along with everything else. Also the text on Isolated, initial, etc. is a bit confusing, add borders maybe? And finally, the medial form and final form look identical when they shouldn't be. Fix this too.
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "te";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "se";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "jim";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "ce";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "he";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "xe";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "dal";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "zal";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "re";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "ze";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "ze2";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "sin";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "sin2";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "sad";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "ta";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "za";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "ayn";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "gayn";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "fe";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "qaf";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "kaf";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "gaf";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "lam";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        btn68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalS.chosenLetter = "mim";
                changeScreen();
                MainActivity2 mainActivity2 = new MainActivity2();
            }
        });
        return root; //hola, me from the past here. Use the workbook link in pinned tab once u done with the alphabet, implement one lesson a day. No need for quizzes tbh, let's not get too advanced
=======

        //find how to put functions in fragments
        return root;
>>>>>>> 6b0642a750f59ba22352f2f0eac941089dd97423
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

