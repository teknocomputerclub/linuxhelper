package com.techkwondo.linuxhelper.FinalBuild;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.techkwondo.linuxhelper.FinalBuild.R;

public class secureShellActivity extends AppCompatActivity {
//    TextView textView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secure_shell);
        Toast.makeText(this, "Into Secure Shell", Toast.LENGTH_SHORT).show();
//        textView9 = findViewById(R.id.textView9);
//        textView9.setMovementMethod(new ScrollingMovementMethod());
    }
}