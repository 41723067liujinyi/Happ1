package cn.edu.swufe.happ;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class AddActivity extends AppCompatActivity {

    EditText note;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add1);
        note = findViewById(R.id.add_putin);

        String str = note.getText().toString();
        Button btn = findViewById(R.id.add_save);




    }

    public void save(View btn){

    }



 }



