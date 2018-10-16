package com.example.martin.splitbilldemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class peopleactivity extends AppCompatActivity {
    Spinner spinner1;
    ImageView peoplename;
    int peoplevalue;
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout l3;
    LinearLayout l4;
    LinearLayout l5;
    LinearLayout l6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_peopleactivity );
       // getWindow().getDecorView().setBackgroundColor(getResources().getColor( R.color.activitycolor ));
        peoplename = findViewById( R.id.peoplename );

        l1 = findViewById( R.id.l1 );
        l2 = findViewById( R.id.l2 );
        l3 = findViewById( R.id.l3 );
        l4 = findViewById( R.id.l4 );
        l5 = findViewById( R.id.l5 );
        l6 = findViewById( R.id.l6 );


        final Intent intent = getIntent();
        peoplevalue = Integer.parseInt( intent.getStringExtra( "i1" ) );
        Toast.makeText( peopleactivity.this, peoplevalue + " ", Toast.LENGTH_SHORT ).show();


        layout( peoplevalue );

        spinner1 = findViewById( R.id.spinner1 );
        ArrayAdapter<String> spinner1adaptor = new ArrayAdapter<>( peopleactivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray( R.array.valuespinner ) );
        spinner1adaptor.setDropDownViewResource( android.R.layout.simple_list_item_1 );
        spinner1.setAdapter( spinner1adaptor );
        spinner1.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText( getApplicationContext(), position + 1 + " selected", Toast.LENGTH_SHORT ).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        } );


        //list view image
        peoplename.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent( peopleactivity.this, com.example.martin.splitbilldemo.peoplename.class );
                intent1.putExtra( "intent1", peoplevalue );
                Pair[] pair = new Pair[6];
                pair[0] = new Pair<View, String>( peoplename, "btransition" );
                pair[1] = new Pair<View, String>( peoplename, "btransition" );
                pair[2] = new Pair<View, String>( peoplename, "btransition" );
                pair[3] = new Pair<View, String>( peoplename, "btransition" );
                pair[4] = new Pair<View, String>( peoplename, "btransition" );
                pair[5] = new Pair<View, String>( peoplename, "btransition" );
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation( peopleactivity.this, pair );

                startActivity( intent1, options.toBundle() );


            }
        } );


    }

    public void layout(int pvalue) {
        if (pvalue == 2) {

            l1.setVisibility( View.VISIBLE );
            l2.setVisibility( View.VISIBLE );

        } else if (pvalue == 3) {
            l1.setVisibility( View.VISIBLE );
            l2.setVisibility( View.VISIBLE );
            l3.setVisibility( View.VISIBLE );
        } else if (pvalue == 4) {
            l1.setVisibility( View.VISIBLE );
            l2.setVisibility( View.VISIBLE );
            l3.setVisibility( View.VISIBLE );
            l4.setVisibility( View.VISIBLE );
        } else if (pvalue == 5) {
            l1.setVisibility( View.VISIBLE );
            l2.setVisibility( View.VISIBLE );
            l3.setVisibility( View.VISIBLE );
            l4.setVisibility( View.VISIBLE );
            l5.setVisibility( View.VISIBLE );
        } else if (pvalue == 6) {
            l1.setVisibility( View.VISIBLE );
            l2.setVisibility( View.VISIBLE );
            l3.setVisibility( View.VISIBLE );
            l4.setVisibility( View.VISIBLE );
            l5.setVisibility( View.VISIBLE );
            l6.setVisibility( View.VISIBLE );
        }


    }


}
