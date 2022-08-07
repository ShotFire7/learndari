package com.example.learndari.ui.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.learndari.MainActivity;
import com.example.learndari.R;
import com.example.learndari.databinding.FragmentDashboardBinding;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class DrawActivity extends Activity {
//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//        DrawActivity drawActivity =
//                new ViewModelProvider(this).get(DrawActivity.class);
//
//        binding = FragmentDashboardBinding.inflate(inflater, container, false);
//        View root = binding.getRoot();
//        return root;
//    }
//the above is useless. Delete it later.
    private DrawingArea drawingArea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw2);
        TextView text = (TextView) findViewById(R.id.textView4);
        text.setText(GlobalS.drawLetter);
        Log.d("CREATION",GlobalS.drawLetter);

        @SuppressLint("UseSwitchCompatOrMaterialCode")
        Switch hswitch = (Switch) findViewById(R.id.switch1);
        hswitch.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b){
                text.setVisibility(View.VISIBLE);
            }
            else  {
                text.setVisibility(View.GONE);
            }
        });
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @Override
    public void onPause() {
        super.onPause();
        drawingArea.trimMemory();
    }

    @Override
    public void onResume() {
        super.onResume();
        initDrawingArea();
    }

    private void initDrawingArea() {
        if (drawingArea == null) {
            drawingArea = (DrawingArea) findViewById(R.id.drawing_area);
            drawingArea.initTrailDrawer();
        }
    }




    /** on click, see layout.xml */
    public void onQuillSelected(View view) {
        drawingArea.onQuillSelected();
    }

    /** on click, see layout.xml */
    public void onMarkerSelected(View view) {
        drawingArea.onMarkerSelected();
    }

    /** on click, see layout.xml */
    public void onClearSelected(View view) {
        drawingArea.onClearSelected();
    }

    /** on click, see layout.xml */
    public void onMultistrokeSwitchToggled(View view) {
        @SuppressLint("UseSwitchCompatOrMaterialCode")
        Switch toggle = (Switch) view;
        drawingArea.onMultistrokeSwitchToggled(toggle.isChecked());
    }
}

