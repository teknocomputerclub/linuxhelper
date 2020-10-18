package com.techkwondo.linuxhelper.FinalBuild;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.techkwondo.linuxhelper.FinalBuild.R;

public class fileCommandsActivity extends AppCompatActivity implements View.OnClickListener {
//    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_commands);
        Toast.makeText(this, "Into File Commands", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View view) {
        //textView = (TextView) is redundant
//        textView = findViewById(R.id.textView);
//        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}