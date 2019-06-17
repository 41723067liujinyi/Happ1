package cn.edu.swufe.happ;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//点击列表行进入页面
public class EditActivity extends AppCompatActivity implements View.OnClickListener{

    EditText note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        note = findViewById(R.id.edit_putin);
        Button btn = findViewById(R.id.edit_save);
        String str = note.getText().toString();
        btn.setOnClickListener(this);

        Intent intent = getIntent();
        String edit_note = intent.getStringExtra("edit_note");

        note.setText(edit_note);



    }


    @Override
    public void onClick(View v) {

        note = findViewById(R.id.edit_putin);
        String str = note.getText().toString();

//        //获取当前系统时间
//        Date today = Calendar.getInstance().getTime();
//        //转换为字符串类型
//        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        final String todayStr=sdf.format(today);
        Intent intent = getIntent();
        Bundle bd1 = new Bundle();
        bd1.putString("new_note",str);
        // bd1.putString("putin_time",todayStr);
        //  intent.putExtras(bd1);
        intent.putExtra("new_note",str);
        //intent.putExtra("putin_time",todayStr);
        setResult(4,intent);
        finish();
    }
}
