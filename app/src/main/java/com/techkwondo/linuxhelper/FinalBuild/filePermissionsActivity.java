package com.techkwondo.linuxhelper.FinalBuild;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.techkwondo.linuxhelper.FinalBuild.R;

public class filePermissionsActivity extends AppCompatActivity {
//    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_permissions);
        Toast.makeText(this, "Into File Permissions", Toast.LENGTH_SHORT).show();
        //textView = (TextView) is redundant
//        textView = findViewById(R.id.textView3);
//        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}