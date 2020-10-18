package com.techkwondo.linuxhelper.FinalBuild;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class processRelatedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_related);
        Toast.makeText(this, "Into Process Related", Toast.LENGTH_SHORT).show();

    }
}