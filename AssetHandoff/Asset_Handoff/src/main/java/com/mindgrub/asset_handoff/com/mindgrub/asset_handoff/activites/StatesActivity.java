package com.mindgrub.asset_handoff.com.mindgrub.asset_handoff.activites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.mindgrub.asset_handoff.R;


public class StatesActivity extends Activity implements AdapterView.OnItemClickListener
{
    protected ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_states);

        listView = (ListView) findViewById(R.id.listView);

        String [] items = new String[] {"Item #1", "Item #2", "Item #3", "Item #4", "Item #5", "Item #6"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        Intent intent = new Intent(this, StatesDetailsActivity.class);
        startActivity(intent);
    }
}
