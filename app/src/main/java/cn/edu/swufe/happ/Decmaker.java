package cn.edu.swufe.happ;

import android.app.Activity;
import android.app.ListActivity;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Decmaker extends AppCompatActivity {
     private TextView text;
//    private ImageView img;
//    private static String strs[] = {"","",""};
//    private SensorManager sensorManager;
//    private Vibrator vibrator;
      private  ArrayList<HashMap<String,String>>optionListItems;
      private SimpleAdapter listItemAdapter;
      private EditText putin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decision_maker);

        //ListView listView = findViewById(R.id.dec_list);

      //  MyAdapter1 myAdapter1= new MyAdapter1(this,R.layout.list_item,optionListItems);
        //listView.setAdapter(myAdapter1);
        //ListAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        //simple_list_item_1这是Android系统自带的简单的item布局
        //listView.setAdapter(myAdapter1);





//        text=(TextView)findViewById(R.id.dec_title);
//        img=(ImageView)findViewById(R.id.jth_pic);
//
//        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
//        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);//振动
    }


    //获取输入的文本添加到listview中
    public void tianjia(View btn1){
        ListView listView = findViewById(R.id.dec_list);
        optionListItems = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> map = new HashMap<String,String>();
        EditText opt1=findViewById(R.id.dec_putin);
        String str=opt1.getText().toString();
        map.put("ItemTitle",str);
        optionListItems.add(map);
//        listItemAdapter = new SimpleAdapter(this,optionListItems,R.layout.list_item,
//                new String[]{"ItemTitle","ItemDetail"},new int[]{R.id.itemTitle,R.id.itemDetail});
        MyAdapter1 myAdapter1= new MyAdapter1(this,R.layout.list_item,optionListItems);
        listView.setAdapter(myAdapter1);
        //ListAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionListItems);
        //listView.setAdapter(adapter);
    }
    //开始抽取选项，跳转页面至结果
    public void kaishi(View btn2){

    }


}
