package ioandroid.github.tymicruz.smartbutton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;//view is any type of widget;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    int toggle = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get a reference to the button
        Button smartButton = (Button)findViewById(R.id.cruzButton);



        //click is a tap
        smartButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        toggle++;
                        TextView smartText = (TextView)findViewById(R.id.cruzText);

                        if(toggle % 2 != 0)
                            smartText.setText("The Button is smart!");
                        else
                            smartText.setText("Hi, mom!");
                    }
                }
        );

        //holding down or when button is town for longer than a second
        smartButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        toggle++;
                        TextView smartText = (TextView)findViewById(R.id.cruzText);

                        if(toggle % 2 == 0)
                            smartText.setText("The Button is genius!");
                        else
                            smartText.setText("Hola, Madre!");




                        return false;
                    }
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
