package com.newera.example.notetaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button btnAddnote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d("HomeActivity","OnCreate called");
        findViews();
        setListeners();
    }

    private void findViews(){
        btnAddnote = findViewById(R.id.btnAddNote);
    }
    private void setListeners(){
        btnAddnote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,AddNoteActivity.class);
                startActivity(i);

            }
        });
    }
}
