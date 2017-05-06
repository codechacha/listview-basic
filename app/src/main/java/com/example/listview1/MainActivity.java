package com.example.listview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    static final String[] mItems = {"Item 1", "Item 2", "Item 3"} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = (ListView) findViewById(R.id.lv_listview) ;
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mItems) ;
        listview.setAdapter(adapter) ;
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = (String) parent.getItemAtPosition(position) ;
                Toast.makeText(MainActivity.this, (position + 1) +"번째 : " + text,
                            Toast.LENGTH_SHORT).show();
            }
        });
    }
    
}
