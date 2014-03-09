package com.mindgrub.asset_handoff.com.mindgrub.asset_handoff.activites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mindgrub.asset_handoff.R;

import java.util.ArrayList;


public class MainActivity extends Activity
{

    private ListView listView;

    private static final String COLORS = "Colors";
    private static final String FONTS = "Text/Fonts";
    private static final String GRADIENTS = "Gradients";
    private static final String CUSTOM_DRAWING = "Custom Drawing";
    private static final String STRETCHING = "Stretching";
    private static final String STATES = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        final ArrayList<String> views = new ArrayList<String>() {{add(COLORS);add(FONTS);add(GRADIENTS);add(CUSTOM_DRAWING);
                                                                add(STRETCHING); add(STATES);}};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, views);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String viewName = views.get(position);

                Class activityClass = null;

                if(viewName.equals(COLORS))
                {
                    activityClass = ColorActivity.class;
                }
                else if(viewName.equals(FONTS))
                {
                    activityClass = FontActivity.class;
                }
                else if(viewName.equals(GRADIENTS))
                {
                    activityClass = GradientActivity.class;
                }
                else if(viewName.equals(CUSTOM_DRAWING))
                {
                    activityClass = CustomDrawingActivity.class;
                }
                else if(viewName.equals(STRETCHING))
                {
                    activityClass = StretchingActivity.class;
                }
                else if(viewName.equals(STATES))
                {
                    activityClass = StatesActivity.class;
                }

                if(activityClass != null)
                {
                    startActivity(new Intent(MainActivity.this, activityClass));
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
