package cn.edu.bistu.cs.se.text4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ListView list;
    private final static String NAME="name";
    private final static String NUMBER="number";
    private final static String AGE="age";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.list);
        String[] name={"解思琪","李子源","王娟","张思含"};
        String[] number={"2014011860","2014011861","2014011862","2014011863"};
        String[] age={"18","19","20","20"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<name.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME, name[i]);
            item.put(NUMBER,number[i]);
            item.put(AGE, age[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,NUMBER,AGE},new int[]{R.id.name,R.id.number,R.id.age});
        list.setAdapter(adapter);


    }


}
