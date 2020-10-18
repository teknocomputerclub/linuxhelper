package com.techkwondo.linuxhelper.FinalBuild;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class commandCategories extends AppCompatActivity implements View.OnClickListener {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13, openWebPage;
    TextView textView;
    String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_categories);

        //Buttons Views & Listeners
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        textView = (TextView) findViewById(R.id.textView1);
        openWebPage = findViewById(R.id.openWebPageBtn);

        // Set listeners
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        openWebPage.setOnClickListener(this);
    }
    public void onClick(View view) {
//      Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Moving....", Toast.LENGTH_SHORT).show();
        switch(view.getId()){
            case R.id.button0 :
                Intent intent = new Intent(commandCategories.this, fileCommandsActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent);
                Log.i(TAG, "intent called for file commands activity");
                break;
            case R.id.button1 :
                Intent intent1 = new Intent(commandCategories.this, fileCompressionActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent1);
                Log.i(TAG, "intent called for file compression activity");
                break;
            case R.id.button2 :
                Intent intent2 = new Intent(commandCategories.this, secureShellActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent2);
                Log.i(TAG, "intent called for secure shell activity");
                break;
            case R.id.button3 :
                Intent intent3 = new Intent(commandCategories.this, fileTransferActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent3);
                Log.i(TAG, "intent called for file transfer activity");
                break;
            case R.id.button4 :
                Intent intent4 = new Intent(commandCategories.this, packageManagementActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent4);
                Log.i(TAG, "intent called for package management activity");
                break;
            case R.id.button5 :
                Intent intent5 = new Intent(commandCategories.this, networkActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent5);
                Log.i(TAG, "intent called for network activity");
                break;
            case R.id.button6 :
                Intent intent6 = new Intent(commandCategories.this, directoryActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent6);
                Log.i(TAG, "intent called for boot activity");
                break;
            case R.id.button7 :
                Intent intent7 = new Intent(commandCategories.this, searchActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent7);
                Log.i(TAG, "intent called for search activity");
                break;
            case R.id.button8 :
                Intent intent8 = new Intent(commandCategories.this, filePermissionsActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent8);
                Log.i(TAG, "intent called for file permissions");
                break;
            case R.id.button9 :
                Intent intent9 = new Intent(commandCategories.this, systemCommandsActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent9);
                Log.i(TAG, "intent called for system commands");
                break;
            case R.id.button10 :
                Intent intent10 = new Intent(commandCategories.this, processRelatedActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent10);
                Log.i(TAG, "intent called for text editors");
                break;
            case R.id.button11 :
                Intent intent11 = new Intent(commandCategories.this, hardwareActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent11);
                Log.i(TAG, "intent called for hardware");
                break;
            case R.id.button12 :
                Intent intent12 = new Intent(commandCategories.this, diskUsageActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent12);
                Log.i(TAG, "intent called for Disk Usage");
                break;
            case R.id.button13 :
                Intent intent13 = new Intent(commandCategories.this, userActivity.class); // <--- you INTEND on calling the other activity
                startActivity(intent13);
                Log.i(TAG, "intent called for Users");
                break;
            case R.id.openWebPageBtn :
                Intent intent14 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://lmgtfy.com/?q=www.commandlinefu.com"));
                startActivity(intent14);
                break;
//            case R.id.addCommandBtn :
//                Intent intent13 = new Intent(commandCategories.this,MainActivity.class); // <--- you INTEND on calling the other activity
//                startActivity(intent13);
//                Log.i(TAG, "intent called for add command");
//                break;
        }
    }
}