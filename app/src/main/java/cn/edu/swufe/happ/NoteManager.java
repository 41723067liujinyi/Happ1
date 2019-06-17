package cn.edu.swufe.happ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class NoteManager {
    private DBHelper dbHelper;
    private String TBNAME;

    public NoteManager(Context context){
        dbHelper = new DBHelper(context);
        TBNAME = DBHelper.TB_NAME;
    }

    public void add(NoteItem item){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        ContentValues values = new ContentValues();
        //values.put("curname",item.getCurName());
       // values.put("currate",item.getCurRate());
        values.put("curnote",item.getCurNote());
        db.insert(TBNAME,null,values);
        db.close();
    }

    public void addAll(List<NoteItem> list){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        for (NoteItem item : list) {
            ContentValues values = new ContentValues();
            values.put("curnote", item.getCurNote());

            db.insert(TBNAME, null, values);
        }
        db.close();
    }



    public List<NoteItem> listAll(){
        List<NoteItem>noteList =null;//定义返回数据
        SQLiteDatabase db = dbHelper.getReadableDatabase();//获得数据库的访问
        Cursor cursor = db.query(TBNAME,null,null,null,null,null,null);
        if(cursor!=null){
            noteList = new ArrayList<NoteItem>();
            while (cursor.moveToNext()){
                NoteItem item =new NoteItem();
                item.setId(cursor.getInt(cursor.getColumnIndex("ID")));
                //item.setCurName(cursor.getString(cursor.getColumnIndex("CURNAME")));
               // item.setCurRate(cursor.getString(cursor.getColumnIndex("CURRATE")));
                item.setCurNote(cursor.getString(cursor.getColumnIndex("CURNOTE")));
                noteList.add(item);
            }
            cursor.close();
        }
        db.close();
        return noteList;
    }







}
