package com.mindgrub.asset_handoff.com.mindgrub.asset_handoff.activites;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.mindgrub.asset_handoff.R;
import com.mindgrub.asset_handoff.com.mindgrub.asset_handoff.util.FontUtil;


public class FontActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font);

        ((TextView)findViewById(R.id.txt_cafeta)).setTypeface(FontUtil.getCafetaTypeFace(this));
        ((TextView)findViewById(R.id.txt_enigma)).setTypeface(FontUtil.getEnigmaTypeFace(this));
        ((TextView)findViewById(R.id.txt_helvetica)).setTypeface(FontUtil.getHelveticaLTProBoldTypeFace(this));
    }



}
