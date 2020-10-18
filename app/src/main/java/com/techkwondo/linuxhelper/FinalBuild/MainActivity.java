package com.techkwondo.linuxhelper.FinalBuild;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.techkwondo.linuxhelper.FinalBuild.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    private static final String TAG = "Main Activity";
    private EditText itemET;
    private Button btn, categoryBtn;
    private ListView itemsList;

    private String tempString = "";
    private int pos;

    private ArrayList<String> items;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        categoryBtn = findViewById(R.id.categoryBtn);
        itemET = findViewById(R.id.item_edit_text);
        btn = findViewById(R.id.add_btn);
        itemsList = findViewById(R.id.items_list);

        items = FileHelper.readData(this);
        String TAG;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        itemsList.setAdapter(adapter);
        categoryBtn.setOnClickListener(this);
        btn.setOnClickListener(this);
        itemsList.setOnItemClickListener(this);

        //set the OnItemLongClickListener -- Click on the red light bulb to implement the method
        itemsList.setOnItemLongClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.add_btn:
                //add if for the edit
                if (tempString != ""){
                    String itemEntered = itemET.getText().toString();
                    adapter.add(itemEntered);
                    itemET.setText("");

                    //Delete old item
                    items.remove(pos);
                    adapter.notifyDataSetChanged();

                    //Write the new data,  delete and add newly edited item
                    FileHelper.writeData(items, this);
                    Toast.makeText(this, "Item Edited", Toast.LENGTH_SHORT).show();

                } else{
                    String itemEntered = itemET.getText().toString();
                    adapter.add(itemEntered);
                    itemET.setText("");
                    FileHelper.writeData(items, this);

                    Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.categoryBtn :
                Intent intent = new Intent(MainActivity.this, commandCategories.class);
                startActivity(intent);
                Log.i(TAG, "intent called for file commands activity");
                break;

        }
    }

    //Copy and paste all the items in the OnItemClick Method and Put into the LongItemClick
    //This will make it so it now makes the user LongPress on the item to delete,  and just a single tap to edit

    //Edit Items
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //set edit text to item
        itemET.setText(items.get(position));
        //set cursor to end of word,  get the text length thats in the text edit
        itemET.setSelection(itemET.getText().length());

        tempString = items.get(position);
        pos = position;
    }

    //Delete Items
    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

        items.remove(position);
        adapter.notifyDataSetChanged();
        FileHelper.writeData(items, this);
        Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();

        return false;
    }
}