package com.techkwondo.linuxhelper.FinalBuild;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class networkActivity extends AppCompatActivity {
//        TextView textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        Toast.makeText(this, "Into Network", Toast.LENGTH_SHORT).show();
//        textView6 = findViewById(R.id.textView6);
//        textView6.setMovementMethod(new ScrollingMovementMethod());

    }
}