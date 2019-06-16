package cn.edu.swufe.happ;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NoteActivity extends AppCompatActivity {
     public final String TAG = "NoteActivity";
     TextView note1;
     //ListView note2;

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


        ListView listView =(ListView)findViewById(R.id.list_view);
        //String data[] = {"1","2","3"};
        List<String> list1= new ArrayList<String>();
        list1.add(add_note);
        ListAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,list1);
        listView.setAdapter(adapter);

    }

//应用菜单的方法
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.addnotes,menu);
        return true;
    }
//菜单项事件处理
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.menu_add){
            Intent add1=new Intent(this,AddActivity.class);
            startActivity(add1);
        }

        return super.onOptionsItemSelected(item);
    }
}
