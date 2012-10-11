package com.milot.example.list;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Hajdari");
        lista.add("Hanifja");
        lista.add("Xhemshiti");
        lista.add("Hamiti");
        lista.add("Bislimi");
        lista.add("Basria");
        
        ArrayAdapter<String> adapteri = new
        		ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        
        
        setListAdapter(adapteri);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
