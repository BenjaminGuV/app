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
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        slc_pick_up.setAdapter( adapter );


        Spinner slc_pick_up_ac = (Spinner) findViewById( R.id.slc_pick_up );
        ArrayAdapter<CharSequence> adapter_dos = ArrayAdapter.createFromResource( this,
                R.array.slc_pick_up_ac, android.R.layout.simple_spinner_item );
        adapter_dos.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        slc_pick_up_ac.setAdapter( adapter_dos );

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
