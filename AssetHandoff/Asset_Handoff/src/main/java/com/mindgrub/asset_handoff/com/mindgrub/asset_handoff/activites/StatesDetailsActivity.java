package com.mindgrub.asset_handoff.com.mindgrub.asset_handoff.activites;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.mindgrub.asset_handoff.R;

public class StatesDetailsActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_states_details);
    }

    public void onButtonClick(View view)
    {
        Toast.makeText(this, ((Button)view).getText(), Toast.LENGTH_SHORT).show();
    }
}
