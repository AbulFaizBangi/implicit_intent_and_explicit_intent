package com.example.implicitexplicitfunctionsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ExperimentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiments);
    }
    public void showPracticalExperiments() {
        String experimentsInfo = "Information about practical experiments...\n\n";
        experimentsInfo += "List of Laboratory Assignments:\n";
        for (int i =  1; i <=  10; i++) {
            experimentsInfo += "Assignment " + i + "\n";
        }
        TextView tvOutput = findViewById(R.id.tvOutput);
        tvOutput.setText(experimentsInfo);
    }
}