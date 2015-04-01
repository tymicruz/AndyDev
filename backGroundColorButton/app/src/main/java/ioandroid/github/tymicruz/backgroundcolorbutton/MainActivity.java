package ioandroid.github.tymicruz.backgroundcolorbutton;

import android.provider.Telephony;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.graphics.Color;
import android.view.View.OnTouchListener;
import java.lang.Object;
import java.lang.Runnable;
import android.view.MotionEvent;
import android.os.Handler;


public class MainActivity extends ActionBarActivity {

    int r=255, g=255, b=255;
    int r2 = r, g2 = g, b2 = b;
    int buttonHoldTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rButton = (Button)findViewById(R.id.redButton);
        Button gButton = (Button)findViewById(R.id.greenButton);
        Button bButton = (Button)findViewById(R.id.blueButton);

        Button rUp = (Button)findViewById(R.id.redUp);
        Button gUp = (Button)findViewById(R.id.greenUp);
        Button bUp = (Button)findViewById(R.id.blueUp);

        Button rDown = (Button)findViewById(R.id.redDown);
        Button gDown = (Button)findViewById(R.id.greenDown);
        Button bDown = (Button)findViewById(R.id.blueDown);

        Button cButton = (Button)findViewById(R.id.colorButton);

        RelativeLayout rL = (RelativeLayout)findViewById(R.id.relativeLayout);

        rL.setOnClickListener(
                new RelativeLayout.OnClickListener(){
                    public void onClick(View v){
                        TextView rValue = (TextView)findViewById(R.id.redValue);
                        TextView gValue = (TextView)findViewById(R.id.greenValue);
                        TextView bValue = (TextView)findViewById(R.id.blueValue);
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        rValue.setText(String.valueOf(r2));
                        gValue.setText(String.valueOf(g2));
                        bValue.setText(String.valueOf(b2));
                        cButton.setBackgroundColor(Color.rgb(r2,g2,b2));
                    }

                }
        );

        rUp.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView rValue = (TextView)findViewById(R.id.redValue);
                        TextView gValue = (TextView)findViewById(R.id.greenValue);
                        TextView bValue = (TextView)findViewById(R.id.blueValue);
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        r = Integer.parseInt(rValue.getText().toString());
                        g = Integer.parseInt(gValue.getText().toString());
                        b = Integer.parseInt(bValue.getText().toString());
                        //if red isn't already maxed out
                        if(r < 255)
                        {
                            r++;
                            rValue.setText(String.valueOf(r));
                            cButton.setBackgroundColor(Color.rgb(r,g,b));
                        }
                    }
                }
        );

        gUp.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView rValue = (TextView)findViewById(R.id.redValue);
                        TextView gValue = (TextView)findViewById(R.id.greenValue);
                        TextView bValue = (TextView)findViewById(R.id.blueValue);
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        r = Integer.parseInt(rValue.getText().toString());
                        g = Integer.parseInt(gValue.getText().toString());
                        b = Integer.parseInt(bValue.getText().toString());
                        //if green isn't already maxed out
                        if(g < 255)
                        {
                            g++;
                            gValue.setText(String.valueOf(g));
                            cButton.setBackgroundColor(Color.rgb(r,g,b));
                        }
                    }
                }
        );

        bUp.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView rValue = (TextView)findViewById(R.id.redValue);
                        TextView gValue = (TextView)findViewById(R.id.greenValue);
                        TextView bValue = (TextView)findViewById(R.id.blueValue);
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        r = Integer.parseInt(rValue.getText().toString());
                        g = Integer.parseInt(gValue.getText().toString());
                        b = Integer.parseInt(bValue.getText().toString());
                        //if blue isn't already maxed out
                        if(b < 255)
                        {
                            b++;
                            bValue.setText(String.valueOf(b));
                            cButton.setBackgroundColor(Color.rgb(r,g,b));
                        }
                    }
                }
        );

        rDown.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView rValue = (TextView)findViewById(R.id.redValue);
                        TextView gValue = (TextView)findViewById(R.id.greenValue);
                        TextView bValue = (TextView)findViewById(R.id.blueValue);
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        r = Integer.parseInt(rValue.getText().toString());
                        g = Integer.parseInt(gValue.getText().toString());
                        b = Integer.parseInt(bValue.getText().toString());
                        //if red isn't already 0
                        if(r > 0)
                        {
                            r--;
                            rValue.setText(String.valueOf(r));
                            cButton.setBackgroundColor(Color.rgb(r,g,b));
                        }
                    }
                }
        );

        gDown.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView rValue = (TextView)findViewById(R.id.redValue);
                        TextView gValue = (TextView)findViewById(R.id.greenValue);
                        TextView bValue = (TextView)findViewById(R.id.blueValue);
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        r = Integer.parseInt(rValue.getText().toString());
                        g = Integer.parseInt(gValue.getText().toString());
                        b = Integer.parseInt(bValue.getText().toString());
                        //if green isn't already 0
                        if(g > 0)
                        {
                            g--;
                            gValue.setText(String.valueOf(g));
                            cButton.setBackgroundColor(Color.rgb(r,g,b));
                        }
                    }
                }
        );

        bDown.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView rValue = (TextView)findViewById(R.id.redValue);
                        TextView gValue = (TextView)findViewById(R.id.greenValue);
                        TextView bValue = (TextView)findViewById(R.id.blueValue);
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        r = Integer.parseInt(rValue.getText().toString());
                        g = Integer.parseInt(gValue.getText().toString());
                        b = Integer.parseInt(bValue.getText().toString());
                        //if blue isn't already 0
                        if(b > 0)
                        {
                            b--;
                            bValue.setText(String.valueOf(String.valueOf(b)));
                            cButton.setBackgroundColor(Color.rgb(r,g,b));
                        }
                    }
                }
        );

        cButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        //Button cButton = (Button)findViewById(R.id.colorButton);
                        RelativeLayout rL = (RelativeLayout)findViewById(R.id.relativeLayout);

                        r2 = r; g2 = g; b2 = b;
                        rL.setBackgroundColor(Color.rgb(r,g,b));
                    }
                }
        );


        rDown.setOnTouchListener(
                new View.OnTouchListener() {
                    private Handler mHandler;
                    @Override public boolean onTouch(View v, MotionEvent event) {
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        switch(event.getAction()) {

                            case MotionEvent.ACTION_DOWN:
                                if (mHandler != null)
                                {
                                    //cButton.setText("down not null");
                                    return true;
                                }
                                mHandler = new Handler();
                                mHandler.postDelayed(downAction, 700);
                                //cButton.setText("down null");
                                break;
                            case MotionEvent.ACTION_UP:
                                if (mHandler == null)
                                {
                                    cButton.setText("up null");
                                    return true;
                                }
                                //mHandler.removeCallbacks(downAction);
                                mHandler = null;
                                //cButton.setText("up not null");
                                break;
                        }
                        return true;
                    }

                    Runnable downAction = new Runnable() {
                        @Override public void run() {

                            TextView rValue = (TextView)findViewById(R.id.redValue);
                            Button cButton = (Button)findViewById(R.id.colorButton);

                            r = Integer.parseInt(rValue.getText().toString());

                            //if red isn't already 0
                            if(r > 0)
                            {
                                r--;
                                rValue.setText(String.valueOf(r));
                                cButton.setBackgroundColor(Color.rgb(r,g,b));
                            }

                            if(mHandler != null)
                            mHandler.postDelayed(this, 10);
                        }
                    };
                }
        );

        gDown.setOnTouchListener(
                new View.OnTouchListener() {
                    private Handler mHandler;
                    @Override public boolean onTouch(View v, MotionEvent event) {
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        switch(event.getAction()) {

                            case MotionEvent.ACTION_DOWN:
                                if (mHandler != null)
                                {
                                    //cButton.setText("down not null");
                                    return true;
                                }
                                mHandler = new Handler();
                                mHandler.postDelayed(downAction, 700);
                                //cButton.setText("down null");
                                break;
                            case MotionEvent.ACTION_UP:
                                if (mHandler == null)
                                {
                                    //cButton.setText("up null");
                                    return true;
                                }
                                mHandler.removeCallbacks(downAction);
                                mHandler = null;
                                //cButton.setText("up not null");
                                break;
                        }
                        return false;
                    }

                    Runnable downAction = new Runnable() {
                        @Override public void run() {

                            TextView gValue = (TextView)findViewById(R.id.greenValue);
                            Button cButton = (Button)findViewById(R.id.colorButton);

                            g = Integer.parseInt(gValue.getText().toString());

                            //if red isn't already 0
                            if(g > 0)
                            {
                                g--;
                                gValue.setText(String.valueOf(g));
                                cButton.setBackgroundColor(Color.rgb(r,g,b));
                            }

                            if(mHandler != null)
                            mHandler.postDelayed(this, 10);
                        }
                    };
                }
        );

        bDown.setOnTouchListener(
                new View.OnTouchListener() {
                    private Handler mHandler;
                    @Override public boolean onTouch(View v, MotionEvent event) {
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        switch(event.getAction()) {

                            case MotionEvent.ACTION_DOWN:
                                if (mHandler != null)
                                {
                                    //cButton.setText("down not null");
                                    return true;
                                }
                                mHandler = new Handler();
                                mHandler.postDelayed(downAction, 700);
                                //cButton.setText("down null");
                                break;
                            case MotionEvent.ACTION_UP:
                                if (mHandler == null)
                                {
                                    //cButton.setText("up null");
                                    return true;
                                }
                                mHandler.removeCallbacks(downAction);
                                mHandler = null;
                                //cButton.setText("up not null");
                                break;
                        }
                        return false;
                    }

                    Runnable downAction = new Runnable() {
                        @Override public void run() {

                            TextView bValue = (TextView)findViewById(R.id.blueValue);
                            Button cButton = (Button)findViewById(R.id.colorButton);

                            b = Integer.parseInt(bValue.getText().toString());

                            //if red isn't already 0
                            if(b > 0)
                            {
                                b--;
                                bValue.setText(String.valueOf(b));
                                cButton.setBackgroundColor(Color.rgb(r,g,b));
                            }

                            if(mHandler != null)
                            mHandler.postDelayed(this, 10);
                        }
                    };
                }
        );

        rUp.setOnTouchListener(
                new View.OnTouchListener() {
                    private Handler mHandler;
                    @Override public boolean onTouch(View v, MotionEvent event) {
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        switch(event.getAction()) {

                            case MotionEvent.ACTION_DOWN:
                                if (mHandler != null)
                                {
                                    //cButton.setText("down not null");
                                    return true;
                                }
                                mHandler = new Handler();
                                mHandler.postDelayed(downAction, 700);
                                //cButton.setText("down null");
                                break;
                            case MotionEvent.ACTION_UP:
                                if (mHandler == null)
                                {
                                    //cButton.setText("up null");
                                    return true;
                                }
                                mHandler.removeCallbacks(downAction);
                                mHandler = null;
                                //cButton.setText("up not null");
                                break;
                        }
                        return true;
                    }

                    Runnable downAction = new Runnable() {
                        @Override public void run() {

                            TextView rValue = (TextView)findViewById(R.id.redValue);
                            Button cButton = (Button)findViewById(R.id.colorButton);

                            r = Integer.parseInt(rValue.getText().toString());

                            //if red isn't already 0
                            if(r < 255)
                            {
                                r++;
                                rValue.setText(String.valueOf(r));
                                cButton.setBackgroundColor(Color.rgb(r,g,b));
                            }

                            if(mHandler != null)
                            mHandler.postDelayed(this, 10);
                        }
                    };
                }
        );

        gUp.setOnTouchListener(
                new View.OnTouchListener() {
                    private Handler mHandler;
                    @Override public boolean onTouch(View v, MotionEvent event) {
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        switch(event.getAction()) {

                            case MotionEvent.ACTION_DOWN:
                                if (mHandler != null)
                                {
                                    //cButton.setText("down not null");
                                    return true;
                                }
                                mHandler = new Handler();
                                mHandler.postDelayed(downAction, 700);
                                //cButton.setText("down null");
                                break;
                            case MotionEvent.ACTION_UP:
                                if (mHandler == null)
                                {
                                    //cButton.setText("up null");
                                    return true;
                                }
                                mHandler.removeCallbacks(downAction);
                                mHandler = null;
                                //cButton.setText("up not null");
                                break;
                        }
                        return false;
                    }

                    Runnable downAction = new Runnable() {
                        @Override public void run() {

                            TextView gValue = (TextView)findViewById(R.id.greenValue);
                            Button cButton = (Button)findViewById(R.id.colorButton);

                            g = Integer.parseInt(gValue.getText().toString());

                            //if red isn't already 0
                            if(g < 255)
                            {
                                g++;
                                gValue.setText(String.valueOf(g));
                                cButton.setBackgroundColor(Color.rgb(r,g,b));
                            }

                            if(mHandler != null)
                            mHandler.postDelayed(this, 10);
                        }
                    };
                }
        );

        bUp.setOnTouchListener(
                new View.OnTouchListener() {
                    private Handler mHandler;
                    @Override public boolean onTouch(View v, MotionEvent event) {
                        Button cButton = (Button)findViewById(R.id.colorButton);
                        switch(event.getAction()) {

                            case MotionEvent.ACTION_DOWN:
                                if (mHandler != null)
                                {
                                    //cButton.setText("down not null");
                                    return true;
                                }
                                mHandler = new Handler();
                                mHandler.postDelayed(downAction, 700);
                                //cButton.setText("down null");
                                break;
                            case MotionEvent.ACTION_UP:
                                if (mHandler == null)
                                {
                                    //cButton.setText("up null");
                                    return true;
                                }
                                mHandler.removeCallbacks(downAction);
                                mHandler = null;
                                //cButton.setText("up not null");
                                break;
                        }
                        return false;
                    }

                    Runnable downAction = new Runnable() {
                        @Override public void run() {

                            TextView bValue = (TextView)findViewById(R.id.blueValue);
                            Button cButton = (Button)findViewById(R.id.colorButton);

                            b = Integer.parseInt(bValue.getText().toString());

                            //if red isn't already 0
                            if(b < 255)
                            {
                                b++;
                                bValue.setText(String.valueOf(b));
                                cButton.setBackgroundColor(Color.rgb(r,g,b));
                            }

                            if(mHandler != null)
                            mHandler.postDelayed(this, 10);
                        }
                    };
                }
        );

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
