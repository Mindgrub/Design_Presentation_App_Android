package com.mindgrub.asset_handoff.com.mindgrub.asset_handoff.activites;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.graphics.Bitmap;

import com.mindgrub.asset_handoff.R;


public class CustomDrawingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_drawing);

        ImageView circle = (ImageView)findViewById(R.id.circle);

        Bitmap bmp = Bitmap.createBitmap(100, 100, Bitmap.Config.RGB_565);

        Paint myPaint = new Paint();
        myPaint.setColor(Color.WHITE);

        Canvas c = new Canvas(bmp);

        c.drawRect(0, 0, 100, 100, myPaint);

        myPaint.setColor(Color.RED);

        c.drawCircle(50, 50, 50, myPaint);

        circle.setBackgroundDrawable(new BitmapDrawable(bmp));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.custom_drawing, menu);
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
