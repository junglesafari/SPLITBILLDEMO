package com.example.martin.splitbilldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.martin.splitbilldemo.R;

public class peoplename extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    EditText ed5;
    EditText ed6;


    ImageView b1;
    ImageView b2;
    ImageView b3;
    ImageView b4;
    ImageView b5;
    ImageView b6;

    CardView bc1;
    CardView bc2;
    CardView bc3;
    CardView bc4;
    CardView bc5;
    CardView bc6;

    CardView ec1;
    CardView ec2;
    CardView ec3;
    CardView ec4;
    CardView ec5;
    CardView ec6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_peoplename );
      //  getWindow().getDecorView().setBackgroundColor(getResources().getColor( R.color.activitycolor ));
        Intent intent = getIntent();
        int peoplenumber = intent.getIntExtra( "intent1", 2 );
        Toast.makeText( getApplicationContext(), peoplenumber + "", Toast.LENGTH_SHORT ).show();

        ed1 = findViewById( R.id.ed1 );
        ed2 = findViewById( R.id.ed2 );
        ed3 = findViewById( R.id.ed3 );
        ed4 = findViewById( R.id.ed4 );
        ed5 = findViewById( R.id.ed5 );
        ed6 = findViewById( R.id.ed6 );


        ec1 = findViewById( R.id.ec1 );
        ec2 = findViewById( R.id.ec2 );
        ec3 = findViewById( R.id.ec3 );
        ec4 = findViewById( R.id.ec4 );
        ec5 = findViewById( R.id.ec5 );
        ec6 = findViewById( R.id.ec6 );


        b1 = findViewById( R.id.b1 );
        b2 = findViewById( R.id.b2 );
        b3 = findViewById( R.id.b3 );
        b4 = findViewById( R.id.b4 );
        b5 = findViewById( R.id.b5 );
        b6 = findViewById( R.id.b6 );


        bc1 = findViewById( R.id.cardView6 );
        bc2 = findViewById( R.id.cardView7 );
        bc3 = findViewById( R.id.cardView8 );
        bc4 = findViewById( R.id.cardView9 );
        bc5 = findViewById( R.id.cardView10 );
        bc6 = findViewById( R.id.cardView11 );


        if (peoplenumber == 2) {
            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );


            bc2.setVisibility( View.VISIBLE );
            bc1.setVisibility( View.VISIBLE );


        } else if (peoplenumber == 3) {

            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );
            ec3.setVisibility( View.VISIBLE );

            bc1.setVisibility( View.VISIBLE );
            bc2.setVisibility( View.VISIBLE );
            bc3.setVisibility( View.VISIBLE );


        } else if (peoplenumber == 4) {

            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );
            ec3.setVisibility( View.VISIBLE );
            ec4.setVisibility( View.VISIBLE );


            bc1.setVisibility( View.VISIBLE );
            bc2.setVisibility( View.VISIBLE );
            bc3.setVisibility( View.VISIBLE );
            bc4.setVisibility( View.VISIBLE );


        } else if (peoplenumber == 5) {


            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );
            ec3.setVisibility( View.VISIBLE );
            ec4.setVisibility( View.VISIBLE );
            ec5.setVisibility( View.VISIBLE );

            bc1.setVisibility( View.VISIBLE );
            bc2.setVisibility( View.VISIBLE );
            bc3.setVisibility( View.VISIBLE );
            bc4.setVisibility( View.VISIBLE );
            bc5.setVisibility( View.VISIBLE );


        } else if (peoplenumber == 6) {

            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );
            ec3.setVisibility( View.VISIBLE );
            ec4.setVisibility( View.VISIBLE );
            ec5.setVisibility( View.VISIBLE );
            ec6.setVisibility( View.VISIBLE );

            bc1.setVisibility( View.VISIBLE );
            bc2.setVisibility( View.VISIBLE );
            bc3.setVisibility( View.VISIBLE );
            bc4.setVisibility( View.VISIBLE );
            bc5.setVisibility( View.VISIBLE );
            bc6.setVisibility( View.VISIBLE );


        }


    }
}
