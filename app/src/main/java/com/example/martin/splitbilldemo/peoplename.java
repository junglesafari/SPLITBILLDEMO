package com.example.martin.splitbilldemo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
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

    String user1;
    String user2;
    String user3;
    String user4;
    String user5;
    String user6;

    Button addmember;
    SharedPreferences sharedPrefusername;
    SharedPreferences sharedPrefvalues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_peoplename );
        //  getWindow().getDecorView().setBackgroundColor(getResources().getColor( R.color.activitycolor ));


        addmember = findViewById( R.id.addmember );

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


        sharedPrefusername = getSharedPreferences( "users", Context.MODE_PRIVATE );
        sharedPrefvalues = getSharedPreferences( "values", Context.MODE_PRIVATE );

        Intent intent = getIntent();
        final int peoplenumber = intent.getIntExtra( "intent1", 2 );
        visibleelement( peoplenumber );
        Toast.makeText( getApplicationContext(), peoplenumber + "", Toast.LENGTH_SHORT ).show();


        String yn = sharedPrefusername.getString( "memberinout", "" );
        if (!yn.equals( "in" )) {
            addmember.setVisibility( View.VISIBLE );
        } else {
            addmember.setVisibility( View.GONE );
        }

        addmember.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storedata(peoplenumber);

            }
        } );


    }

    private void visibleelement(int n) {
        if (n == 2) {


            user1 = sharedPrefusername.getString( "user1", "" );
            user2 = sharedPrefusername.getString( "user2", "" );
            if (!user1.equals( "" )) {
                ed1.setText( user1 );
                ed2.setText( user2 );
            }


            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );


            bc2.setVisibility( View.VISIBLE );
            bc1.setVisibility( View.VISIBLE );


        } else if (n == 3) {

            user1 = sharedPrefusername.getString( "user1", "" );
            user2 = sharedPrefusername.getString( "user2", "" );
            user3 = sharedPrefusername.getString( "user3", "" );

            if (!user1.equals( "" )) {
                ed1.setText( user1 );
                ed2.setText( user2 );
                ed3.setText( user3 );
            }


            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );
            ec3.setVisibility( View.VISIBLE );

            bc1.setVisibility( View.VISIBLE );
            bc2.setVisibility( View.VISIBLE );
            bc3.setVisibility( View.VISIBLE );


        } else if (n == 4) {

            user1 = sharedPrefusername.getString( "user1", "" );
            user2 = sharedPrefusername.getString( "user2", "" );
            user3 = sharedPrefusername.getString( "user3", "" );
            user4 = sharedPrefusername.getString( "user4", "" );
            if (!user1.equals( "" )) {
                ed1.setText( user1 );
                ed2.setText( user2 );
                ed3.setText( user3 );
                ed4.setText( user4 );
            }


            ec1.setVisibility( View.VISIBLE );
            ec2.setVisibility( View.VISIBLE );
            ec3.setVisibility( View.VISIBLE );
            ec4.setVisibility( View.VISIBLE );


            bc1.setVisibility( View.VISIBLE );
            bc2.setVisibility( View.VISIBLE );
            bc3.setVisibility( View.VISIBLE );
            bc4.setVisibility( View.VISIBLE );


        } else if (n == 5) {
            user1 = sharedPrefusername.getString( "user1", "" );
            user2 = sharedPrefusername.getString( "user2", "" );
            user3 = sharedPrefusername.getString( "user3", "" );
            user4 = sharedPrefusername.getString( "user4", "" );
            user5 = sharedPrefusername.getString( "user5", "" );
            if (!user1.equals( "" )) {
                ed1.setText( user1 );
                ed2.setText( user2 );
                ed3.setText( user3 );
                ed4.setText( user4 );
                ed5.setText( user5 );
            }


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


        } else if (n == 6) {

            user1 = sharedPrefusername.getString( "user1", "" );
            user2 = sharedPrefusername.getString( "user2", "" );
            user3 = sharedPrefusername.getString( "user3", "" );
            user4 = sharedPrefusername.getString( "user4", "" );
            user5 = sharedPrefusername.getString( "user5", "" );
            user6 = sharedPrefusername.getString( "user6", "" );
            if (!user1.equals( "" )) {
                ed1.setText( user1 );
                ed2.setText( user2 );
                ed3.setText( user3 );
                ed4.setText( user4 );
                ed5.setText( user5 );
                ed6.setText( user6 );
            }


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

    private void storedata(int m) {
        SharedPreferences.Editor editor = sharedPrefusername.edit();
        editor.putString("memberinout","in"  );

        if (m == 2) {
            user1 = ed1.getText().toString().trim();
            user2 = ed2.getText().toString().trim();

            if (user1.equals( "" ) || user2.equals( "" )) {
                Toast.makeText( getApplicationContext(), "Please fill the member name", Toast.LENGTH_SHORT ).show();
            } else {
                editor.putString( "user1", user1 );
                editor.putString( "user2", user2 );
                editor.putInt( "mnumber",2 );
                editor.commit();
            }


        } else if (m == 3) {
            user1 = ed1.getText().toString().trim();
            user2 = ed2.getText().toString().trim();
            user3 = ed3.getText().toString().trim();

            if (user1.equals( "" ) || user2.equals( "" ) || user3.equals( "" )) {
                Toast.makeText( getApplicationContext(), "Please fill the name of all members", Toast.LENGTH_SHORT ).show();
            } else {
                editor.putString( "user1", user1 );
                editor.putString( "user2", user2 );
                editor.putString( "user3", user3 );
                editor.putInt( "mnumber",3 );
                editor.commit();
            }
        } else if (m == 4) {


            user1 = ed1.getText().toString().trim();
            user2 = ed2.getText().toString().trim();
            user3 = ed3.getText().toString().trim();
            user4 = ed4.getText().toString().trim();

            if (user1.equals( "" ) || user2.equals( "" ) || user3.equals( "" ) || user4.equals( "" )) {
                Toast.makeText( getApplicationContext(), "Please fill the name of all members", Toast.LENGTH_SHORT ).show();
            } else {
                editor.putString( "user1", user1 );
                editor.putString( "user2", user2 );
                editor.putString( "user3", user3 );
                editor.putString( "user4", user4 );
                editor.putInt( "mnumber",4 );
                editor.commit();

            }


        } else if (m == 5) {


            user1 = ed1.getText().toString().trim();
            user2 = ed2.getText().toString().trim();
            user3 = ed3.getText().toString().trim();
            user4 = ed4.getText().toString().trim();
            user5 = ed5.getText().toString().trim();

            if (user1.equals( "" ) || user2.equals( "" ) || user3.equals( "" ) || user4.equals( "" ) || user5.equals( "" )) {
                Toast.makeText( getApplicationContext(), "Please fill the name of all members", Toast.LENGTH_SHORT ).show();
            } else {
                editor.putString( "user1", user1 );
                editor.putString( "user2", user2 );
                editor.putString( "user3", user3 );
                editor.putString( "user4", user4 );
                editor.putString( "user5", user5 );
                editor.putInt( "mnumber",5 );
                editor.commit();

            }


        } else if (m == 6) {

            user1 = ed1.getText().toString().trim();
            user2 = ed2.getText().toString().trim();
            user3 = ed3.getText().toString().trim();
            user4 = ed4.getText().toString().trim();
            user5 = ed5.getText().toString().trim();
            user6 = ed6.getText().toString().trim();

            if (user1.equals( "" ) || user2.equals( "" ) || user3.equals( "" ) || user4.equals( "" ) || user5.equals( "" )||user6.equals( "" )) {
                Toast.makeText( getApplicationContext(), "Please fill the name of all members", Toast.LENGTH_SHORT ).show();
            } else {
                editor.putString( "user1", user1 );
                editor.putString( "user2", user2 );
                editor.putString( "user3", user3 );
                editor.putString( "user4", user4 );
                editor.putString( "user5", user5 );
                editor.putString( "user6", user6 );
                editor.putInt( "mnumber",6 );
                editor.commit();

            }


        }

    }

}
