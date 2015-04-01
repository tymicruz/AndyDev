package ioandroid.github.tymicruz.jessica;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;//for relative layout
import android.widget.Button; //for button widget
import android.graphics.Color; //for colors
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //layout
        RelativeLayout cruzLayout = new RelativeLayout(this);
        cruzLayout.setBackgroundColor(Color.rgb(0,255,128));

        //button
        Button blueButton = new Button(this);
        blueButton.setText("click heer for bere");
        blueButton.setBackgroundColor(Color.BLUE);

        //username input
        EditText username = new EditText(this);

        blueButton.setId(1);
        username.setId(2);

        //rules for what i want layout to do
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);


        //rules for user name positioning or rules
        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //give rules to position widgets
        //position this above blue button
        usernameDetails.addRule(RelativeLayout.ABOVE, blueButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0, 0, 0, 50);

        //gets resources from this app
        Resources r = getResources();

        //type casting something into an int
        //we are trying to convert device independent pixels into
        int pxl = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200,
                r.getDisplayMetrics()
        );

        username.setWidth(pxl);

        //adding button widget to layout (button is child of layout)
        //1st param = what you want to add
        //2nd param = how you want to add it
        cruzLayout.addView(blueButton, buttonDetails);

        //add username to layout with rules
        cruzLayout.addView(username, usernameDetails);

        //set view using a layout (set this activity's content/display to this view)
        setContentView(cruzLayout);


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
