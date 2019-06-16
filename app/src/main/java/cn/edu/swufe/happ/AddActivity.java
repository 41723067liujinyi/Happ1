package cn.edu.swufe.happ;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class AddActivity extends AppCompatActivity implements View.OnClickListener{

    EditText note;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add1);
        note = findViewById(R.id.add_putin);
        Button btn = findViewById(R.id.add_save);
        String str = note.getText().toString();
        btn.setOnClickListener(this);



    }



    public void openOne(View btn){
        //打开一个页面activity
        //Log.i("open","openOne: ");
        Intent hello=new Intent(this,NoteActivity.class);
        startActivity(hello);
        //Intent web=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));//跳转到百度
        //Intent tele1=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:87092173"));//跳转到拨号
        //openConfig();
        //finish();
    }


    public void save(View btn){

    }


    @Override
    public void onClick(View v) {
        Intent notes=new Intent(this,NoteActivity.class);
         //传数据过去
        note = findViewById(R.id.add_putin);
        String str = note.getText().toString();

        notes.putExtra("putin_note",str);


        startActivity(notes);
    }



}



