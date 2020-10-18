package com.techkwondo.linuxhelper.FinalBuild;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.techkwondo.linuxhelper.FinalBuild.R;

public class hardwareActivity extends AppCompatActivity {
//    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware);
        Toast.makeText(this, "Into Hardware", Toast.LENGTH_SHORT).show();
//        textView5 = findViewById(R.id.textView5);
//        textView5.setMovementMethod(new ScrollingMovementMethod());
    }
}