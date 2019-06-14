package cn.edu.swufe.happ;

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
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Decmaker extends AppCompatActivity {
//    private TextView text;
//    private ImageView img;
//    private static String strs[] = {"","",""};
//    private SensorManager sensorManager;
//    private Vibrator vibrator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decision_maker);
        ListView listView = findViewById(R.id.dec_list);
        String data[]={""};


        ListAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        //simple_list_item_1这是Android系统自带的简单的item布局
        listView.setAdapter(adapter);





//        text=(TextView)findViewById(R.id.dec_title);
//        img=(ImageView)findViewById(R.id.jth_pic);
//
//        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
//        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);//振动
    }


    //获取输入的文本添加到listview中
    public void tianjia(View btn1){
        ListView listView = findViewById(R.id.dec_list);
        List<HashMap<String,String>> optionListItems = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> map = new HashMap<String,String>();
        EditText opt1=findViewById(R.id.dec_putin);
        String str=opt1.getText().toString();
        map.put("ItemTitle",str);
        optionListItems.add(map);
        //ListAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,);
        //listView.setAdapter(adapter);
    }
    //开始抽取选项，跳转页面至结果
    public void kaishi(View btn2){

    }


}
