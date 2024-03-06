package com.example.implicitexplicitfunctionsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAttachSyllabus = findViewById(R.id.btnAttachSyllabus);
        btnAttachSyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSyllabus();
            }
        });

        Button btnShowExperiments = findViewById(R.id.btnShowExperiments);
        btnShowExperiments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showExperimentInfo();
            }
        });


    }

    public void openSyllabus() {

        // Implicit function: Open the syllabus link in the browser
        String syllabusUrl = "https://www.aitpune.com/Documents/ETC/BEETC_SYLLABUS.pdf";
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(syllabusUrl));
        startActivity(browserIntent);
    }

    public void showExperimentInfo() {
        Button btnExperiments = findViewById(R.id.btnShowExperiments);
        btnExperiments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExperimentsActivity.class);
                startActivity(intent);
            }
        });

        // Explicit function: Show information about the practical experiment
        Toast.makeText(this, "This is an example of a practical experiment.", Toast.LENGTH_LONG).show();
    }



}
