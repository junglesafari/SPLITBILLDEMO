package com.example.martin.splitbilldemo;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.util.Pair;
import android.view.View;

import com.shawnlin.numberpicker.NumberPicker;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    NumberPicker numberPicker;
    TextView pickervalue;
    TextView nextstep;
    ImageView rt;
    ImageView pt;
    ImageView bt;
    ImageView ct;
    ImageView aboutusbutton;
    TextView resumebutton;
    CardView resumebuttoncard;
    SharedPreferences sharedPreusername;
    SharedPreferences sharedPrefvalues;
    int k=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        // getWindow().getDecorView().setBackgroundColor(getResources().getColor( R.color.activitycolor ));

        rt = findViewById( R.id.rt );
        pt = findViewById( R.id.pt );
        bt = findViewById( R.id.bt );
        ct = findViewById( R.id.ct );
        aboutusbutton = findViewById( R.id.aboutusbutton );
        resumebutton = findViewById( R.id.resumebutton );
        resumebuttoncard = findViewById( R.id.resumebuttoncard );

        sharedPreusername = getSharedPreferences( "users", Context.MODE_PRIVATE );
        sharedPrefvalues = getSharedPreferences( "values", Context.MODE_PRIVATE );


        resumebutton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // int i=sharedPreusername.getInt( "mnumber",2 );

                Intent intent = new Intent( MainActivity.this, peopleactivity.class );
                intent.putExtra( "i1", k );
                startActivity( intent );
            }
        } );



        aboutusbutton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, aboutusactivity.class );
                Pair[] pairs = new Pair[4];
                pairs[0] = new Pair<View, String>( rt, "rt" );
                pairs[1] = new Pair<View, String>( pt, "pt" );
                pairs[2] = new Pair<View, String>( bt, "bt" );
                pairs[3] = new Pair<View, String>( ct, "ct" );

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation( MainActivity.this, pairs );
                startActivity( intent, options.toBundle() );
            }
        } );


        numberPicker = findViewById( R.id.number_picker );
        pickervalue = findViewById( R.id.pickervalue );
        nextstep = findViewById( R.id.nextstep );
        numberPicker.setOnClickListener( new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                Log.d( "TAG", "Click on current value" );

            }
        } );

// OnValueChangeListener
        numberPicker.setOnValueChangedListener( new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                //Toast.makeText( MainActivity.this,"new value = "+oldVal+", new value = "+newVal,Toast.LENGTH_SHORT ).show();
                // Log.d("TAG", String.format(Locale.US, "oldVal: %d, newVal: %d", oldVal, newVal));
                pickervalue.setText( newVal + "" );

            }
        } );
        nextstep.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor = sharedPreusername.edit();
                editor.clear();
                editor.commit();

                SharedPreferences.Editor editor1 = sharedPrefvalues.edit();
                editor1.clear();
                editor1.commit();


                Intent intent = new Intent( MainActivity.this, peopleactivity.class );
                intent.putExtra( "i1", pickervalue.getText().toString().trim() );
                startActivity( intent );
            }
        } );

    }

    @Override
    protected void onStart() {
        super.onStart();
        String memberinorout = sharedPreusername.getString( "memberinout", "" );

        if (memberinorout.equals( "in" )) {
            resumebuttoncard.setVisibility( View.VISIBLE );
            k=sharedPreusername.getInt( "mnumber",2 );
            Toast.makeText( getApplicationContext(),sharedPreusername.getInt( "mnumber",2 )+" ",Toast.LENGTH_SHORT).show();
        } else {
            resumebuttoncard.setVisibility( View.INVISIBLE );
        }

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
