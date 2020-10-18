package com.techkwondo.linuxhelper.FinalBuild;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.techkwondo.linuxhelper.FinalBuild.R;

public class packageManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_management);
        Toast.makeText(this, "Into Package Management", Toast.LENGTH_SHORT).show();

    }
}