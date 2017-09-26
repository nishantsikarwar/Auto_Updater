package com.example.nishant.auto_updater;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    private ListView list_professor;
    private TextView name_professor;
    private Switch status_switch;
    private Context context;
    private ArrayList<Data_Professor> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name_professor=(TextView)findViewById(R.id.name_professor);

        list_professor=(ListView)findViewById(R.id.list_professor);

        status_switch =(Switch)findViewById(R.id.status_switch);

        Data_Professor data_professor =new Data_Professor();
      //  ArrayAdapter<String> arrayAdapter_string=new ArrayAdapter<String>(context,R.layout.list_item,R.id.name_professor,professor_name);

              arrayList=new ArrayList<Data_Professor>();
        Data_Adapter data_adapter =new Data_Adapter((Activity) context,R.layout.list_item,arrayList);
        list_professor.setAdapter(data_adapter);

    }
}
