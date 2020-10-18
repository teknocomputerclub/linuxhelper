package com.techkwondo.linuxhelper.FinalBuild;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.techkwondo.linuxhelper.FinalBuild.R;

public class fileCompressionActivity extends AppCompatActivity {
//    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_compress);
        Toast.makeText(this, "Into File Compression", Toast.LENGTH_SHORT).show();
    }
    public void onClick(View view) {
//      Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
//        textView = findViewById(R.id.textView2);
//        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}