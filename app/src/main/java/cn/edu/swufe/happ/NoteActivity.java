package cn.edu.swufe.happ;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

public class NoteActivity extends AppCompatActivity {
     public final String TAG = "NoteActivity";
     TextView note1;
     ListView note2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list1);

        Intent intent = getIntent();
        String add_note = intent.getStringExtra("putin_note");

        note1 = (TextView)findViewById(R.id.list_text);
        //note2 = (ListView) findViewById(R.id.list_view);

        note1.setText(add_note);
       // note2.put(add_note);

        Log.i(TAG,"onCreate:add_note+"+ add_note);

    }


}
