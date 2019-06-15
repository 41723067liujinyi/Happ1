package cn.edu.swufe.happ;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NoteActivity extends AppCompatActivity {
     public final String TAG = "NoteActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list1);

        Intent intent = getIntent();
        String add_note = intent.getStringExtra("putin_note");


        Log.i(TAG,"onCreate:add_note+"+ add_note);

    }


}
