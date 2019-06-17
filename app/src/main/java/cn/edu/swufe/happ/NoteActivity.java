package cn.edu.swufe.happ;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static android.content.ContentValues.TAG;

public class NoteActivity extends AppCompatActivity  {
     public final String TAG = "NoteActivity";
     TextView note1;
     //ListView note2;
     private String logData = "";
     //private final String DATE_SP_KEY = "lastRateDataStr";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list1);
        ListView listView =(ListView)findViewById(R.id.list_view);

        SharedPreferences sharedPreferences= getSharedPreferences("mynote", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String list_note1 =sharedPreferences.getString("note1","");

//        dollarRate= sharedPreferences.getFloat("dollar_rate",0.0f);
//        euroRate= sharedPreferences.getFloat("euro_rate",0.0f);
//        wonRate= sharedPreferences.getFloat("won_rate",0.0f);
//        updateDate=sharedPreferences.getString("update_date","");
        List<String> list1= new ArrayList<String>();
        list1.add(list_note1);

        ListAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,list1);
        listView.setAdapter(adapter);


//        List<String>retList = new ArrayList<>();
//        NoteManager manager = new NoteManager(this);
//        for(NoteItem  item : manager.listAll() ){
//            retList.add(item.getCurNote());
//        }


//获取sp里保存的数据
        //SharedPreferences sharedPreferences = getSharedPreferences("my_notes",
                                                          //Activity.MODE_PRIVATE);
        //sharedPreferences.get;

//        Intent intent = getIntent();
//        String add_note = intent.getStringExtra("putin_note");
//        note1 = (TextView)findViewById(R.id.list_text);
//        //note2 = (ListView) findViewById(R.id.list_view);
//        note1.setText(add_note);
//       // note2.put(add_note);
//        Log.i(TAG,"onCreate:add_note+"+ add_note);
//
//
//        ListView listView =(ListView)findViewById(R.id.list_view);
//        //String data[] = {"1","2","3"};
//        List<String> list1= new ArrayList<String>();
//        list1.add(add_note);
//        ListAdapter adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,list1);
//        listView.setAdapter(adapter);

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
            //打开列表窗口
            Intent add1=new Intent(this,AddActivity.class);
            startActivityForResult(add1,1);



            //测试数据库
//            NoteItem item1 = new NoteItem("123456");
//            NoteManager manager = new NoteManager(this);
//            manager.add(item1);
//            manager.add(new NoteItem("09876"));
//            Log.i(TAG,"onOPtionsItemSelected:写入数据完毕");
//
//            //查询所有数据
//            List<NoteItem> testList = manager.listAll();
//            for(NoteItem i : testList ){
//                Log.i(TAG,"onOPtionsItemSelected:取出数据完毕"+ i.getCurNote());
//            }

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==1 && resultCode==2){
            String add_note =data.getStringExtra("putin_note");
            //String add_time =data.getStringExtra("putin_time");

         ListView listView =(ListView)findViewById(R.id.list_view);
        //String data[] = {"1","2","3"};
        List<String> list1= new ArrayList<String>();
        list1.add(add_note);
//
//        List<NoteItem>noteList = new ArrayList<NoteItem>();
//        noteList.add(new NoteItem(add_note));
//        NoteManager manager = new NoteManager(this);
//        manager.addAll(noteList);
//

            ListAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,list1);
        listView.setAdapter(adapter);

            SharedPreferences sharedPreferences= getSharedPreferences("mynote",Activity.MODE_PRIVATE);
            SharedPreferences.Editor editor= sharedPreferences.edit();
            editor.putString("note1",add_note);
            editor.commit();
            Log.i(TAG,"onActivityResult:数据已经保存到sharePreferences");


//自定义适配器
//            ListView listView =(ListView)findViewById(R.id.list_view);
//            ArrayList<HashMap<String,String>> optionListItems = new ArrayList<HashMap<String,String>>();
//            HashMap<String,String> map = new HashMap<String,String>();
//            map.put("ItemTitle",add_note);
//            //map.put("ItemDetail",add_time);
//            //map.put("ItemDetail","12");
//            optionListItems.add(map);
//
//            MyAdapter1 myAdapter1= new MyAdapter1(this,R.layout.list_item,optionListItems);
//            listView.setAdapter(myAdapter1);


        }
        super.onActivityResult(requestCode, resultCode, data);
    }



    public void onItemClick(AdapterView<?> parent, View view,
                            int position, long id) {
        ListView listView =(ListView)findViewById(R.id.list_view);
        Object itemAtPosition = listView.getItemAtPosition(position);
        List<String> list1= (ArrayList<String>)itemAtPosition;

        TextView note = (TextView) view.findViewById(android.R.id.text1);
        String note2 = String.valueOf(note.getText());

        //打开新的页面，传入参数

        Intent noteEdit =new Intent(this,EditActivity.class);
        noteEdit.putExtra("note",note2);
        startActivity(noteEdit);
    }


}
