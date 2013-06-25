package com.example.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner slc_pick_up = (Spinner) findViewById( R.id.slcPickUp );
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this,
                R.array.lista_ciudad, android.R.layout.simple_spinner_item );
        //slc_pick_up.setDropDownHorizontalOffset(  );
        slc_pick_up.setAdapter(s slc_pick_up);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
