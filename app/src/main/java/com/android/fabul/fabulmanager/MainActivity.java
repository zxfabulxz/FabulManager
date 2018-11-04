package com.android.fabul.fabulmanager;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {
    private Chronometer chronometer;
    private boolean running;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    public void checkPassword(View v){
        EditText t = (EditText) findViewById(R.id.pass);
        String testo = t.getText().toString();
        String pass = "123";
        if(testo.equals(pass))
        {
            ActionBar ab = getSupportActionBar();
            ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

            ab.addTab(ab.newTab().setText("Cronometri").setTabListener(this));
            ab.addTab(ab.newTab().setText("Palestra").setTabListener(this));
            ab.addTab(ab.newTab().setText("LOL").setTabListener(this));
            ab.addTab(ab.newTab().setText("Scuola").setTabListener(this));

            Button check = (Button) findViewById(R.id.pass_check);
            check.setVisibility(View.INVISIBLE);
            t.setVisibility(View.INVISIBLE);
        }
        else
        {
            Log.i("PASSCHECK",pass+" "+t.getText());
        }
    }
}
