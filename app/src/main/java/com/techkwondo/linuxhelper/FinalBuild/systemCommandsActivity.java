package com.techkwondo.linuxhelper.FinalBuild;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.techkwondo.linuxhelper.FinalBuild.R;

public class systemCommandsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_commands);
        Toast.makeText(this, "Into System Commands", Toast.LENGTH_SHORT).show();

    }
}