package com.techkwondo.linuxhelper.FinalBuild;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.techkwondo.linuxhelper.FinalBuild.R;

public class fileTransferActivity extends AppCompatActivity {
//    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_transfer);
        Toast.makeText(this, "Into File Transfer", Toast.LENGTH_SHORT).show();
//        textView4 = findViewById(R.id.textView4);
//        textView4.setMovementMethod(new ScrollingMovementMethod());
    }
}